import { createApp } from "vue";
import "./style.css";
import App from "./App.vue";
import { createRouter, createWebHistory } from "vue-router";

import PaginaInicial from "./components/PaginaInicial.vue";
import DetalheProduto from "./components/DetalheProduto.vue";
import ViewCarrinho from "./components/ViewCarrinho.vue";

const routes = [
  { path: "/", component: PaginaInicial },
  { path: "/produto/id", component: DetalheProduto },
  {path: "/carrinho", component:ViewCarrinho}
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

createApp(App).use(router).mount("#app");
