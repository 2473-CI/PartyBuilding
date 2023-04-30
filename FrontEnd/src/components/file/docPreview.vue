<template>
  <vue-office-docx
    :src="`http://47.115.207.245:1994${str}`"
    @rendered="rendered"
  />
</template>

<script setup>
//引入VueOfficeDocx组件
import VueOfficeDocx from "@vue-office/docx";
import axios from "axios";
import { toRefs, reactive, ref } from "vue";
const props = defineProps({
  //子组件接收父组件传递过来的值
  path: String,
});
const docxFile = reactive(null);
//使用父组件传递过来的值
const { path } = toRefs(props);
const str = ref(
  JSON.stringify(path.value).replaceAll('"', "").replace("/file", "/file/word")
);

</script>
