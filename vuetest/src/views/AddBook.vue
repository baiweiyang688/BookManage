<template>

  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
    <el-form-item label="图书名称" prop="name">
      <el-input v-model="ruleForm.name"></el-input>
    </el-form-item>

    <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">创建</el-button>
      <el-button @click="resetForm('ruleForm')">重置</el-button>
    </el-form-item>
  </el-form>

</template>

<script>
  export default {
    data() {
      return {
        ruleForm: {  //表单跟对象的绑定
          name: ''
        },
        rules: {
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
             // axios.get('http://localhost:8383/user/findAll').then( (resp) => {  this.users = resp.data}) 箭头函数  
            this.$axios.post('http://localhost:8081/firstmodule/addMessage?goodsName='+this.ruleForm.name+'').then(
               (resp) => {
                 this.$message("新增成功！")
                 this.$router.push('/bookManage')
                //  alert("新增成功!")
                 //或者if判断返回的值再判定相应的结果
               }
            )
            // alert('创建成功!');
          } else {
            alert('创建失败!!');
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>