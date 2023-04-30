<script setup>
import Topbar from './components/topbar.vue'
import Menu from './components/menu.vue'
import {useRoute} from 'vue-router'

const route = useRoute()


</script>

<template>
    <div id="app">
		<Topbar v-if="route.meta.showTopBar"></Topbar>
		<div class="first">
		<Menu v-if="route.meta.showMenu" style="background-color: rgb(230,25,25);"></Menu>
        <router-view style="background-color: white;"></router-view>
		</div>
    </div>
</template>

<style scoped>
#app{
	display: flex;
	flex-direction: column;
    width: 100%;
    height: 100%;
    background: white;
	
}

.first{
	display: flex;
	width: 100%;
	/* height: 100%; */
	flex: 1 1 auto;
	flex-basis: 0;
}
</style>
