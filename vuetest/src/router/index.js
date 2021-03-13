import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import About from '../views/About.vue'
import Book from '../views/Book.vue'
import Element from '../Element'
import BookManage from '../views/BookManage'
import AddBook from '../views/AddBook'
import BookUpdate from '../views/BookUpdate'
import PageFour from '../views/PageFour'
import App from "../App"
import Index from '../views/index'


Vue.use(VueRouter)

const routes = [

  {
    path: '/',
    name: '图书管理',
    component: Index,
    redirect: "bookManage",
    show: true,
    children: [
      {
        path: "/bookManage",
        name: "查询图书",
        show: true,
        component: BookManage
      },
      {
        path: "/addBook",
        name: "添加图书",
        show: true,
        component: AddBook
      },
        {
    path: '/bookUpdate',
    name: "图书修改",
    show: false,
    component: BookUpdate
     }

    ]
  },

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
  // {
  //   path: "/",
  //   name: "导航1",
  //   component:App 
  // },
  // {
  //   path: '/home',
  //   name: 'Home',
  //   component: Home
  // },
  // {
  //   path: '/book',
  //   // name: 'Book',
  //   component: Book
  // },
  // {
  //   path: '/about',
  //   name: 'About',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   // component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  //   component: About
  // }