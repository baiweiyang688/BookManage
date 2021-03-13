

<!--  -->
<template>
  <div>
    <table align="center">
        <tr>
            <td>编号</td> 
            <td>图书名称</td>
            <td>作者</td>
        </tr>
        <tr v-for="item in books">
          <td>{{item.id}}</td>
          <td>{{item.goodsName}}</td>
          <!-- <td>{{item.author}}</td> -->
        </tr>
    </table>
    <br>
    {{msg}}
  </div>
</template>

<script>
export default {
  name: "Book",
  data () {
    return {
      msg: 'Hello Vue!',
      books:[
        {
            id: 1,
            goodsName: 'Java零基础实战'
        },
        {
            id: 2,
            goodsName: 'Vue零基础实战'
        },
        {
            id: 3,
            goodsName: 'Spring Boot零基础实战'
        }
      ]
    }
  },
  created() {
      const _this = this
      this.$axios.get('http://localhost:8081/firstmodule/listGoods?goodsName=').then(function (resp){
          _this.books = resp.data.data
          console.log(resp)
          // axios.get('http://localhost:8383/user/findAll').then( (resp) => {  this.users = resp.data}) 箭头函数
      })
    }
}
</script>

<style  scoped>

</style>
