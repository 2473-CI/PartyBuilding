<script setup>
import { ref, reactive, getCurrentInstance, toRefs, defineProps } from "vue";
import { ElMessage, ElMessageBox } from "element-plus";
import { Plus } from "@element-plus/icons-vue";
import { Axios } from "axios";
import pdfPreview from "../components/file/pdfPreview.vue";
import excelPreview from "../components/file/excelPreview.vue";
import docPreview from "../components/file/docPreview.vue";
import { add, getAllList, del } from "../api/Developers.js";

const fileType = ref("");
const role = ref(JSON.parse(localStorage.getItem('token')).role)
const optionsType = [
  {
    label: "Excel",
    value: "Excel",
  },
  {
    label: "word",
    value: "word",
  },
  {
    label: "pdf",
    value: "pdf",
  },
];

const fileForm = reactive({
  createtime: "",
  title: "",
  path: "",
  belongto: JSON.parse(localStorage.getItem("token")).belongto,
});

const AllList = ref([]);
const getAll = () => {
  getAllList({
    belongto: JSON.parse(localStorage.getItem("token")).belongto,
  }).then((res) => {
    console.log(res);
    for (let item of res.data) {
      // item["createtime"] = new Date(item["createtime"]).toLocaleDateString();
      item["type"] = item["path"].split(".").reverse()[0];
    }
    AllList.value = res.data;
  });
};
getAll();

const reset = () => {
  fileForm.title = "";
  fileForm.createtime = "";
  fileForm.path = "";
  fileType.value = "";
};
const fPath = ref("");
const handleChange = (uploadFile, uploadFiles) => {
  if (uploadFile.response) {
    console.log(uploadFile.response.data.url, uploadFiles);
    fPath.value = uploadFile.response.data.url;
  }
};

const filePath = ref("");
const showExcel = ref(false);
const showWord = ref(false);
const showPdf = ref(false);
const toPerview = (type, fileP) => {
  console.log(type);
  console.log(fileP);
  filePath.value = fileP;
  if (type == "xls") {
    showExcel.value = true;
  } else if ((type = "docx")) {
    showWord.value = true;
  }
};

const ret = () => {
  showExcel.value = false;
  showWord.value = false;
  showPdf.value = false;
};

const isSure = () => {
  fileForm.path = fPath.value;
  add(fileForm).then(async (res) => {
    console.log(res);
    if (res.code == 200) {
      ElMessage({
        showClose: true,
        message: res.data,
        type: "success",
      });
      await getAll();
      fileForm.title = "";
      fileForm.createtime = "";
      fileForm.path = "";
      fileType.value = "";
    } else {
      ElMessage({
        showClose: true,
        message: res.msg,
        type: "error",
      });
    }
  });
};

const dele = (item) => {
  console.log(item);
  ElMessageBox.confirm("确认要删除该任务吗?").then(async (a) => {
    if (a == "confirm") {
      del({
        belongto: item.belongto,
        createtime: item.createtime,
        id: item.id,
        path: item.path,
        title: item.title,
      }).then(async (res) => {
        if (res.code == 200) {
          ElMessage({
            showClose: true,
            message: res.data,
            type: "success",
          });
          await getAll();
        } else {
          ElMessage({
            showClose: true,
            message: res.msg,
            type: "error",
          });
        }
      });
    }
  });
};
</script>
<template>
  <el-button @click="ret()" v-if="showPdf || showWord || showExcel"
    >返回</el-button
  >
  <pdfPreview v-if="showPdf" :path="filePath"> </pdfPreview>
  <docPreview v-if="showWord" :path="filePath"></docPreview>
  <div
    style="height: 650px; width: 80vw; margin-top: 30px; margin-left: -40px"
    v-if="showExcel"
  >
    <excelPreview :path="filePath"> </excelPreview>
  </div>
  <div style="width: 100%" v-if="!showPdf && !showWord && !showExcel">
    <el-card
      class="box-card"
      style="margin-left: 1%; margin-right: 1%; margin-top: 1%"
      v-show="!showPage"
    >
      <el-form :inline="true" class="all-form">
        <el-form-item label="标题">
          <el-input
            placeholder="请填写标题"
            style="width: 220px"
            v-model="fileForm.title"
          >
          </el-input>
        </el-form-item>
        <el-form-item>
          <span>开始时间：</span>
          <el-date-picker
            v-model="fileForm.createtime"
            type="datetime"
            placeholder="请选择开始时间"
          />
        </el-form-item>

        <el-form-item>
          <span>文件类型：</span>
          <el-select
            placeholder="请选择文件类型"
            style="width: 220px"
            v-model="fileType"
          >
            <el-option
              :label="item.label"
              :value="item.value"
              :key="item.value"
              v-for="item in optionsType"
            />
          </el-select>
        </el-form-item>

        <el-form-item>
          <el-upload
            v-model:file-list="fileList"
            class="upload-demo"
            action="http://47.115.207.245:1994/file/upload"
            :on-change="handleChange"
            style="margin-top: 10px"
          >
            <el-button :disabled="role != '基层支部书记'">添加附件</el-button>
          </el-upload>
        </el-form-item>
        <br />
        <div style="width: 400px; margin: auto; text-align: center">
          <el-form-item class="right-bottom">
            <el-button @click="reset()" :disabled="role != '基层支部书记'">重置</el-button>
          </el-form-item>
          <el-form-item class="right-bottom">
            <el-button @click="isSure()" :disabled="role != '基层支部书记'">提交</el-button>
          </el-form-item>
        </div>
      </el-form>
    </el-card>

    <el-card style="margin: 1%; height: 65vh; overflow-y: scroll">
      <el-timeline v-show="!showPage">
        <el-timeline-item
          :timestamp="new Date(item['createtime']).toLocaleDateString()"
          placement="top"
          v-for="(item, index) in AllList"
          :key="index"
        >
          <el-card style="position: relative">
            <h4>{{ item.title }}</h4>

            <el-button
              type="danger"
              style="position: absolute; right: 150px; bottom: 20%"
              @click="dele(item)"
			  :disabled="role != '基层支部书记'"
              >删除</el-button
            >
            <el-button
              type="primary"
              style="position: absolute; right: 30px; bottom: 20%"
              @click="toPerview(item.type, item.path)"
              >预览</el-button
            >
          </el-card>
        </el-timeline-item>
      </el-timeline>
    </el-card>
  </div>
</template>

<style scoped></style>
