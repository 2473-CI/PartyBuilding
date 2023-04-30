<template>
  <vue-office-pdf :src="pdf" @rendered="rendered" />
</template>

<script>
//引入VueOfficePdf组件
import VueOfficePdf from "@vue-office/pdf";

export default {
  components: {
    VueOfficePdf,
  },
  data() {
    return {
      pdf: "http://static.shanhuxueyuan.com/test.pdf", //设置文档地址
    };
  },
  methods: {
    rendered() {
      console.log("渲染实现");
    },
  },
};
</script>
