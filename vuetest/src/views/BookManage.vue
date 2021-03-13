<template>
      <div>
            <el-table
            :data="tableData"
            border
            style="width: 100%">
            <el-table-column
              fixed
              prop="id"
              label="编号"
              width="150"
              align = "center">
            </el-table-column>
            <el-table-column
              prop="goodsName"
              label="商品名称"
              width="120"
              align="center">
            </el-table-column>
            <el-table-column
              fixed="right"
              label="操作"
              width="100">
              <template #default="scope">
                <el-button @click="edit(scope.row)" type="text" size="small">修改</el-button>
                <el-button @click="deleteBook(scope.row)"   type="text" size="small">删除</el-button>
              </template>
            </el-table-column>
          
          </el-table>
 
          <el-pagination
          background
          layout="prev, pager, next"
          page-size="3"
          :total="total"
          @current-change="page"
          >
        </el-pagination>

      </div>
     
</template>

    <script>
      export default {
        methods: {
          deleteBook(row){
            let id = row.id;
            const _this = this;
            _this.$confirm('确定要删除吗?','警告',{
                confirmButtonText: '确定',
                cancelButtonText: '取消',
                type: 'warning'
            }).then(()=>
            {
              this.$axios.post('http://localhost:8081/firstmodule/deleteGoods?id='+id+'').then((resp)=>{
                window.location.reload()
              });
              this.$message({
                type: 'sccess',
                message: '删除成功!'
              });
            }).catch(()=>{
              this.$message({
         
                message: '已取消删除'
              })
            })
          },
          edit(row) {
            this.$router.push({
              path: '/bookUpdate',
              query:{
                name: row.goodsName
              }
            })
          },
          page(currentPage){
            const _this = this
          this.$axios.get('http://localhost:8081/firstmodule/listGoods?pageNum='+currentPage+'&pageSize=4').then(function(res){
            console.log(res.data.data)
             _this.tableData = res.data.data.list
             _this.total = res.data.data.total
          })
         }
        },
        created(){
              const _this = this
           this.$axios.get('http://localhost:8081/firstmodule/listGoods?pageNum=1&pageSize=4').then(function(resp){
            // console.log(resp.data.data)
             _this.tableData = resp.data.data.list
             _this.total = resp.data.data.total
          })
        },
        data() {
          return {
            total: null,
            tableData: null
          }
        }
      }
    </script>