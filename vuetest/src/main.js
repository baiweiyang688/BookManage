import Vue from 'vue'
import Element from './Element.vue'
import router from './router'
import store from './store'
import axios from 'axios'
import VueResource from 'vue-resource' 
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
Vue.use(ElementUI)



Vue.use(VueResource)
Vue.prototype.$axios = axios

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(Element) 
}).$mount('#app')
