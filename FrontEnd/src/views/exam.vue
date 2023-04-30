<script setup>
import { ref, reactive, getCurrentInstance, toRefs, defineProps } from "vue";
import { ElMessage, ElMessageBox } from "element-plus";
import { Plus } from "@element-plus/icons-vue";
import { Axios } from "axios";
import pdfPreview from "../components/file/pdfPreview.vue";
import excelPreview from "../components/file/excelPreview.vue";
import docPreview from "../components/file/docPreview.vue";
import { addExam, getAllListExam, delExam } from "../api/Developers.js";

const fileType = ref("");
const user = ref(JSON.parse(localStorage.getItem('token')))
const optionsType = [
  {
    label: "word",
    value: "word",
  },
];

const fileForm = reactive({
  examinationstarttime: "",
  examinationendtime: "",
  examinationtitle: "",
  examination: "",
  examinationsubmit: "",
  belongto: JSON.parse(localStorage.getItem("token")).belongto,
  source: "",
  userid: user.value.id,
  username:user.value.name
});

const AllList = ref([]);
const getAll = () => {
  getAllListExam({
    belongto: JSON.parse(localStorage.getItem("token")).belongto,
  }).then((res) => {
    console.log(res);
    for (let item of res.data) {
      //   item["examinationstarttime"] = new Date(
      //     item["examinationstarttime"]
      //   ).toLocaleDateString();
      if (item["examination"]) {
        item["type"] = item["examination"].split(".").reverse()[0];
        item["down"] = JSON.stringify(item.examination)
          .replaceAll('"', "")
          .replace("/file", "/file/word");
      } else if (item["examinationsubmit"]) {
        item["type"] = item["examinationsubmit"].split(".").reverse()[0];
        item["down"] = JSON.stringify(item.examinationsubmit)
          .replaceAll('"', "")
          .replace("/file", "/file/word");
      }
    }
    AllList.value = res.data;
    console.log(AllList.value);
  });
};
getAll();

const reset = () => {
  fileForm.examinationtitle = "";
  fileForm.examinationstarttime = "";
  fileForm.examinationsubmit = "";
  fileForm.examination = "";
  fileForm.examination = "";
  fileForm.examinationendtime = "";
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
const toPerview = (type, fileP, fileP2) => {
  console.log(fileP, fileP2);
  if (fileP) {
    filePath.value = fileP;
  } else if (fileP2) {
    filePath.value = fileP2;
  }
  if (type == "docx") {
    showWord.value = true;
  }
};

const ret = () => {
  showExcel.value = false;
  showWord.value = false;
  showPdf.value = false;
};

const isSure = () => {
  if (
    JSON.parse(localStorage.getItem("token")).role == "基层支部书记"
  ) {
    fileForm.examination = fPath.value;
  } else {
    fileForm.examinationsubmit = fPath.value;
  }

  addExam(fileForm).then(async (res) => {
    console.log(res);
    if (res.code == 200) {
      ElMessage({
        showClose: true,
        message: res.data,
        type: "success",
      });
      await getAll();
      fileForm.examinationtitle = "";
      fileForm.examinationstarttime = "";
      fileForm.examinationendtime = "";
      fileForm.examination = "";
      fileForm.examinationsubmit = "";
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
      delExam({
        id: item.id,
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
  <el-button @click="ret()" v-if="showWord">返回</el-button>
  <docPreview v-if="showWord" :path="filePath"></docPreview>

  <div style="width: 100%" v-if="!showWord">
    <el-card
      class="box-card"
      style="
        margin-left: 1%;
        margin-right: 1%;
        margin-top: 1%;
        position: relative;
      "
      v-show="!showPage"
    >
      <el-form :inline="true" class="all-form">
        <el-form-item label="标题">
          <el-input
            placeholder="请填写标题"
            style="width: 220px"
            v-model="fileForm.examinationtitle"
          >
          </el-input>
        </el-form-item>
        <el-form-item>
          <span>开始时间：</span>
          <el-date-picker
            v-model="fileForm.examinationstarttime"
            type="datetime"
            placeholder="请选择开始时间"
          />
        </el-form-item>

        <el-form-item>
          <span>结束时间:</span>
          <el-date-picker
            v-model="fileForm.examinationendtime"
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
            class="upload-demo"
            action="http://47.115.207.245:1994/file/upload"
            :on-change="handleChange"
            style="margin-top: 10px"
          >
            <el-button>添加附件</el-button>
          </el-upload>
        </el-form-item>

        <div style="position: absolute; right: 0; bottom: 20px">
          <el-form-item class="right-bottom">
            <el-button @click="reset()">重置</el-button>
          </el-form-item>
          <el-form-item class="right-bottom">
            <el-button @click="isSure()">提交</el-button>
          </el-form-item>
        </div>
      </el-form>
    </el-card>
    <div style="display: flex; justify-content: space-around">
      <el-card style="margin: 1%; height: 65vh; overflow-y: scroll; width: 48%">
        <h2 style="margin-bottom: 10px">试卷区</h2>
        <el-timeline >
          <div v-for="(item, index) in AllList" :key="index">
            <el-timeline-item
              :timestamp="
                new Date(item['examinationstarttime']).toLocaleDateString()
              "
              placement="top"
              v-if="item.examination"
            >
              <el-card style="position: relative">
                <h4>{{ item.examinationtitle }}</h4>
                <p>
					
                  结束时间:
                  {{
                    new Date(item["examinationendtime"]).toLocaleDateString()
                  }}
                </p>
                <el-button
                  type="danger"
                  style="position: absolute; right: 170px; bottom: 20%"
                  @click="dele(item)"
                  :disabled="user.role != '基层支部书记'">删除</el-button
                >
                <el-button
                  type="primary"
                  style="position: absolute; right: 30px; bottom: 20%"
                  @click="
                    toPerview(
                      item.type,
                      item.examinationsubmit,
                      item.examination
                    )
                  "
                  >预览</el-button
                >
                <a :href="`http://47.115.207.245:1994${item.down}`">
                  <el-button
                    type=""
                    style="position: absolute; right: 100px; bottom: 20%"
                  >
                    下载
                  </el-button>
                </a>
              </el-card>
            </el-timeline-item>
          </div>
        </el-timeline>
      </el-card>

      <el-card style="margin: 1%; height: 65vh; overflow-y: scroll; width: 48%">
        <h2 style="margin-bottom: 10px">答案区</h2>
        <el-timeline>
          <div v-for="(item, index) in AllList" :key="index">
            <el-timeline-item
              :timestamp="
                new Date(item['examinationstarttime']).toLocaleDateString()
              "
              placement="top"
              v-if="item.examinationsubmit"
            >
              <el-card style="position: relative">
                <h4>{{ item.examinationtitle }} <span style="margin-left: 5%;">姓名：{{item.username}}</span></h4>
                <p>
                  结束时间:
                  {{
                    new Date(item["examinationendtime"]).toLocaleDateString()
                  }}
                </p>
                <el-button
                  type="danger"
                  style="position: absolute; right: 170px; bottom: 20%"
                  @click="dele(item)"
                 :disabled="item.userid != user.id && user.role != '基层支部书记'">删除</el-button
                >
                <el-button
                  type="primary"
                  style="position: absolute; right: 30px; bottom: 20%"
				  :disabled="item.userid != user.id && user.role != '基层支部书记'"
                  @click="
                    toPerview(
                      item.type,
                      item.examinationsubmit,
                      item.examination
                    )
                  "
                  >预览</el-button
                >
                <a :href="`http://47.115.207.245:1994${item.down}`">
                  <el-button
                    type=""
                    style="position: absolute; right: 100px; bottom: 20%"
					:disabled="item.userid != user.id && user.role != '基层支部书记'"
                  >
                    下载
                  </el-button>
                </a>
              </el-card>
            </el-timeline-item>
          </div>
        </el-timeline>
      </el-card>
    </div>
  </div>
</template>
<style scoped></style>
