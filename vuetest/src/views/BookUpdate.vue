<!--  -->
<template>
  <div>


  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">

    <el-form-item label="图书编号" prop="id" >
      <el-input v-model="ruleForm.id" readonly></el-input>
    </el-form-item>

    <el-form-item label="图书名称" prop="name">
      <el-input v-model="ruleForm.name"></el-input>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">修改</el-button>
      <el-button @click="resetForm('ruleForm')">重置</el-button>
    </el-form-item>
  </el-form>
</div>

</template>
<script>
  export default {
    data() {
      return {
        ruleForm: {  //表单跟对象的绑定
          id: '',
          name: ''
        },
        rules: {
          id:[
            {required: true }
          ],
          name: [
            { required: true, message: '请输入活动名称', trigger: 'blur' },//trigger失去焦点触发
            { min: 1, max: 20, message: '长度在 1 到 20 个字符', trigger: 'blur' }
          ]
        }
      }; 
    },
    methods: {
      submitForm(formName) {
        const _this = this //这里用了箭头函数，下面可以直接用this
        this.$refs[formName].validate((valid) => {
          if (valid) {
 this.$axios.post('http://localhost:8081/firstmodule/updateGoods?id='+_this.ruleForm.id+'&goodsName='+_this.ruleForm.name+'').then((resp)=>{
             if(resp.data.code==0){
              this.$message("修改成功！")
                 this.$router.push('/bookManage')
             } else{
              this.$message("修改失败！")
             }   
           })
                 
          } 
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    },
    created() {
      const _this = this
       this.$axios.get('http://localhost:8081/firstmodule/listGoods?goodsName='+this.$route.query.name+'').then((resp)=>{
          _this.ruleForm.id = resp.data.data.list[0].id
          _this.ruleForm.name = resp.data.data.list[0].goodsName
       })
    }
  }
</script>

