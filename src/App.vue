<script setup>
import HelloWorld from './components/HelloWorld.vue'
</script>

<template>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">E-Commerce</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <router-link to="/">
            <a class="nav-link active" aria-current="page" href="#">Principal</a>
          </router-link>
        </li>
        <li class="nav-item">
          <router-link to = "/carrinho">
          <a class="nav-link active" aria-current="page" href="#">Carrinho</a>
        </router-link>
        </li>
      </ul>
    </div>
  </div>
</nav>

<router-view></router-view>
</template>

<style scoped>

</style>
