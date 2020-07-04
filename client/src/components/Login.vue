<template>
    <div>
        <div>
            <label for="username">账号：</label>
            <input id="username" type="text" v-model="loginForm.username">
        </div>
        <div>
            <label for="password">密码：</label>
            <input id="password" type="password" v-model="loginForm.password">
        </div>
        <div>
            <input @click="login" type="button" value="登录">
        </div>
    </div>
</template>

<script>
  export default {
    name: "Login",
    data: function () {
      return {
        loginForm: {
          username: "",
          password: ""
        },
        loginResponse: {}
      }
    },
    methods: {
      login: function () {
        this.$axios
            .post('/login', {
              username: this.loginForm.username,
              password: this.loginForm.password
            })
            .then(success => {
              if (success.data.code === 200) {
                this.$router.replace({path: '/index'})
              }
            })
            .catch(fails => {
                console.log(fails)
            })
      }
    }
  }
</script>

<style scoped>

</style>
