<template>
  <div id="app">
<!-- <el-container style="height: 500px; border: 1px solid #eee">
    <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
  <el-menu>
         <el-submenu v-for='(item,index) in $router.options.routes':index="index+''">
          <template slot="title"><i class="el-icon-menu"></i>{{item.name}}</template>
          <el-menu-item v-for="(item2,index2) in item.children":index="index+'-'+index2">{{item2.name}}</el-menu-item>
         </el-submenu>
       </el-menu>
      </el-aside> 
  </el-container> -->

  <router-view>  </router-view>
</div>
</template>

     
      <!-- <el-menu :default-openeds="['1', '3']">
        <el-submenu index="1">
          <template slot="title"><i class="el-icon-menu"></i>导航一</template>
      
            <el-submenu index="1-1-1">
              <template slot="title"><i class="el-icon-message"></i>选项1</template>
              <el-menu-item index="1-1-1-1">选项1-1</el-menu-item>
              <el-menu-item index="1-1-1-2">选项1-2</el-menu-item>
            </el-submenu>
         
          <el-menu-item index="1-2">选项2</el-menu-item>
          <el-submenu index="1-3">
            <template slot="title"><i class="el-icon-setting"></i>选项3</template>
            <el-menu-item index="1-3-1">选项3-1</el-menu-item>
            <el-menu-item index="1-3-2">选项3-2</el-menu-item>
          </el-submenu>
        </el-submenu>



        <el-submenu index="2">
          <template slot="title"><i class="el-icon-menu"></i>导航二</template>
          <el-menu-item-group>
            <template slot="title">分组一</template>
            <el-menu-item index="2-1">选项1</el-menu-item>
            <el-menu-item index="2-2">选项2</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group title="分组2">
            <el-menu-item index="2-3">选项3</el-menu-item>
          </el-menu-item-group>
          <el-submenu index="2-4">
            <template slot="title">选项4</template>
            <el-menu-item index="2-4-1">选项4-1</el-menu-item>
          </el-submenu>
        </el-submenu>
        <el-submenu index="3">
          <template slot="title"><i class="el-icon-setting"></i>导航三</template>
          <el-menu-item-group>
            <template slot="title">分组一</template>
            <el-menu-item index="3-1">选项1</el-menu-item>
            <el-menu-item index="3-2">选项2</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group title="分组2">
            <el-menu-item index="3-3">选项3</el-menu-item>
          </el-menu-item-group>
          <el-submenu index="3-4">
            <template slot="title">选项4</template>
            <el-menu-item index="3-4-1">选项4-1</el-menu-item>
          </el-submenu>
        </el-submenu>
      </el-menu> -->

  <style>
    .el-header {
      background-color: #B3C0D1;
      color: #333;
      line-height: 60px;
    }
    
    .el-aside {
      color: #333;
    }
  </style>
  
  <script>
    export default {
      data() {
        const item = {
          date: '2016-05-02',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        };
        return {
          tableData: Array(20).fill(item)
        }
      }
    };
  </script>


