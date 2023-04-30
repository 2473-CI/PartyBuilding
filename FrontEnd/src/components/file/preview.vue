<template>
  <div class="viewItemFile">
    <!-- 预览文件 -->
    <el-dialog
      width="61%"
      class="viewItemFileDialog"
      title="预 览"
      v-model="dialogVisible"
      :before-close="handleClose"
      :close-on-click-modal="false"
      :close-on-press-escape="false"
    >
      <div
        class="image"
        v-if="
          props.type == 'JPG' ||
          props.type == 'jpg' ||
          props.type == 'JPEG' ||
          props.type == 'jpeg' ||
          props.type == 'PNG' ||
          props.type == 'png'
        "
      >
        <div>
          <img
            style="display: block; max-width: 100%; margin: 0 auto"
            :src="imgUrl"
            alt=""
          />
        </div>
      </div>
      <div class="docWrap" v-if="props.type == 'docx'">
        <!-- 预览文件的地方（用于渲染） -->
        <div ref="file"></div>
      </div>
      <div v-if="props.type == 'xlsx'">
        <div class="tab">
          <el-radio-group
            size="small"
            v-model="excel.sheetNameActive"
            @change="getSheetNameTable"
          >
            <el-radio-button
              v-for="(item, index) in excel.sheetNames"
              :key="index"
              :label="item"
            ></el-radio-button>
          </el-radio-group>
        </div>
        <div style="margin-top: 5px; border: 1px solid #a0a0a0; overflow: auto">
          <div v-html="excel.SheetActiveTable" style="padding: 10px 15px"></div>
        </div>
      </div>
      <div v-if="props.type == 'pdf'">
        <iframe
          :src="pdfurl"
          type="application/x-google-chrome-pdf"
          width="100%"
          height="1000px"
        />
      </div>
    </el-dialog>
  </div>
</template>

<script setup>
import {
  ref,
  nextTick,
  onMounted,
  getCurrentInstance,
  reactive,
  toRefs,
} from "vue";
import * as docx from "docx-preview";
import * as XLSX from "xlsx";
import axios from "axios";
import Axios from "../../request/index.ts";
const { proxy } = getCurrentInstance();
const typeName = ref(props.type);
const imgUrl = ref("");
const srcList = ref();
const loading = ref(false);
const pdfurl = ref("");
const dialogVisible = ref(props.showTime);
const emits = defineEmits();
const emptyTips = ref("暂无内容");
const fullscreen = ref(false);
const data = reactive({
  excel: {
    // 数据
    workbook: {},
    // 表名称集合
    sheetNames: [],
    // 激活项
    sheetNameActive: "",
    // 当前激活表格
    SheetActiveTable: "",
  },
});
const props = defineProps({
  showTime: {
    type: Boolean,
    default: false,
  },
  url: {
    type: String,
    default: "",
  },
  type: {
    type: String,
    default: "image",
  },
  clientHeight: {
    type: Number,
    default: 600,
  },
});

const { excel } = toRefs(data);

onMounted(() => {
  console.log(props.type, "++++");
  init(props.type);
});

// 前一个页面调用的init  我在前一个页面根据文件名字后缀已经判断是什么类型的文件了
function init(type) {
  typeName.value = type;
  if (
    type == "JPG" ||
    type == "JPEG" ||
    type == "PNG" ||
    type == "jpg" ||
    type == "jpeg"
  ) {
    axios
      .request({
        method: "GET", //这个不解释了吧
        url: props.url, //路径
        responseType: "blob", //告诉服务器想到的响应格式
        headers: {
          Accept: "application/octet-stream",
        },
      })
      .then((res) => {
        console.log(res, "image");
        if (res) {
          let blob = new Blob([res.data], { type: "image/jpg" });
          const imageUrl = URL.createObjectURL(blob);
          imgUrl.value = imageUrl;
          (srcList.value = [imageUrl]), (loading.value = true);
        } else {
          // Message.error({ title: "失败", message: "接口请求失败" });
          loading.value = false;
        }
      })
      .catch(function (error) {
        // Message.error({ title: "失败", message: "接口请求失败" });
        console.log(error);
        loading.value = false;
      });
  } else if (type == "pdf") {
    axios
      .request({
        method: "GET", //这个不解释了吧
        url: props.url, //路径
        responseType: "blob", //告诉服务器想到的响应格式
        headers: {
          "Content-Type": "application/pdf;charset=UTF-8",
        },
      })
      .then((res) => {
        console.log(res);
        if (res) {
          let blob = new Blob([res.data], { type: "application/pdf" });
          const url = URL.createObjectURL(blob);
          console.log(url);
          loading.value = false;
          pdfurl.value = url;
        } else {
          // Message.error({ title: "失败", message: "接口请求失败" });
          loading.value = false;
        }
      })
      .catch(function (error) {
        // Message.error({ title: "失败", message: "接口请求失败" });
        console.log(error);
        loading.value = false;
      });
  } else if (type == "xlsx") {
    //表格
    axios
      .request({
        method: "GET", //这个不解释了吧
        url: props.url, //路径
        responseType: "arraybuffer", //告诉服务器想到的响应格式
        headers: {
          "Content-Type":
            "application/vnd.ms-excel;application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
        },
      })
      .then((res) => {
        console.log(res, "res");
        if (res) {
          const workbook = XLSX.read(new Uint8Array(res.data), {
            type: "array",
          });
          const sheetNames = workbook.SheetNames; // 工作表名称集合
          excel.value.workbook = workbook;
          excel.value.sheetNames = sheetNames;
          excel.value.sheetNameActive = sheetNames[0];
          getSheetNameTable(sheetNames[0]);
        } else {
          // Message.error({ title: "失败", message: "接口请求失败" });
          loading.value = false;
        }
      })
      .catch(function (error) {
        // Message.error({ title: "失败", message: "接口请求失败" });
        console.log(error);
        loading.value = false;
      });
  } else if (type == "docx") {
    axios
      .request({
        method: "GET", //这个不解释了吧
        url: props.url, //路径
        responseType: "blob", //告诉服务器想到的响应格式
      })
      .then((res) => {
        console.log(res);
        if (res) {
          // let docx = require("docx-preview");
          docx.renderAsync(res.data, proxy.$refs.file);
        } else {
          // Message.error({ title: "失败", message: "接口请求失败" });
          loading.value = false;
        }
      })
      .catch(function (error) {
        // Message.error({ title: "失败", message: "接口请求失败" });
        // console.log(error);
        loading.value = false;
      });
  }

  dialogVisible.value = true;
}

function getSheetNameTable(sheetName) {
  try {
    // 获取当前工作表的数据
    const worksheet = excel.value.workbook.Sheets[sheetName];
    // 转换为数据  1.json数据有些问题，2.如果是html那么样式需修改
    let htmlData = XLSX.utils.sheet_to_html(worksheet, {
      header: "",
      footer: "",
    });
    htmlData =
      htmlData === ""
        ? htmlData
        : htmlData.replace(
            /<table/,
            '<table class="default-table" border="1px solid #ccc" cellpadding="0" cellspacing="0"'
          );
    // 第一行进行改颜色
    htmlData =
      htmlData === ""
        ? htmlData
        : htmlData.replace(/<tr/, '<tr style="background:#b4c9e8"');
    excel.value.SheetActiveTable = htmlData;
  } catch (e) {
    // 如果工作表没有数据则到这里来处理
    excel.value.SheetActiveTable =
      '<h4 style="text-align: center">' + emptyTips.value + "</h4>";
  }
}

function handleClose() {
  emits("update", false);
}
</script>

<style scoped></style>
