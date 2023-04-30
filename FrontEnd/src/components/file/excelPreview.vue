<template>
  <vue-office-excel
    :src="`http://47.115.207.245:1994${path}`"
    @rendered="rendered"
  />
</template>

<script setup>
//引入VueOfficeExcel组件
import VueOfficeExcel from "@vue-office/excel";
//引入相干款式
import axios from "axios";
import "@vue-office/excel/lib/index.css";
import { toRefs, defineProps, reactive } from "vue";

const props = defineProps({
  //子组件接收父组件传递过来的值
  path: String,
});

const excelFile = reactive(null);
//使用父组件传递过来的值

const { path } = toRefs(props);
// path.value = path.value.replace("/file", "/file/sheet");
console.log(path.value);
// export default {
//   props: ["path"],
//   components: {
//     VueOfficeExcel,
//   },
//   data() {
//     return {
//       excel:
//         "/file/download?filename=application-vnd.ms-excel-1681279952460out (7).xls", //设置文档地址
//     };
//   },
//   methods: {
//     rendered() {
//       console.log(props);
//     },
//   },
// };
</script>
