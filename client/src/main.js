import Vue from 'vue'
import App from './App.vue'
import axios from 'axios'
import router from './router'

axios.defaults.baseURL = 'http://localhost:9999/api'

Vue.prototype.$axios = axios
Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  router,
  components: {App},
  template: '<App/>'
}).$mount('#app')
