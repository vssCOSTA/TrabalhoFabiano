<script setup>
import {ref, computed} from 'vue'
import ApresentacaoProduto from './ApresentacaoProduto.vue';
import Api from './Api'

const produtos = ref([])
const filtro = ref('')

const produtosFiltrados = computed(() => {
  if (filtro.value == '') {
    return produtos.value
  }
  return produtos.value.filter(n => {
    return n.nome.toLowerCase().includes(filtro.value.toLowerCase())
  })
})

function buscar() {
  Api.fazer("http://localhost:8080/produtos").then((data) => {
    produtos.value = data;
  });
}

buscar();
</script>


<template>
    <div class="container">
      <input type="text" class="form-control" placeholder="Buscar" v-model="filtro">
      <div class="row">
        <div class="col-lg-3 col-md-6 col" v-for="produto in produtosFiltrados" :key="produto.id">
          <ApresentacaoProduto :produto="produto"/>
        </div>
      </div>
    </div>
  </template>