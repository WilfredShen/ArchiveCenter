import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../components/Home'
import Login from '../components/Login'

Vue.use(VueRouter)

export default new VueRouter({
  mode: 'history',
  routes: [
    {
      name: 'Default',
      path: '/',
      redirect: '/home',
      component: Home
    },
    {
      name: 'Home',
      path: '/home',
      component: Home,
      redirect: '/index'
    },
    {
      name: 'Login',
      path: '/login',
      component: Login
    }
  ]
})
