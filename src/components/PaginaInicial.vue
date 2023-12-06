<script setup>
import {ref} from 'vue'
import ApresentacaoProduto from './ApresentacaoProduto.vue';

const produtos = ref([
    {
        id:1,
        nome:"Tênis Nike",
        descricao: "O tênis que irá te acompanhar nos mais diversos locais e promover muito estilo a suas composições é o Court Vision Alta LTR.",
        preco: 15,
        imagemUrl: "https://static.netshoes.com.br/produtos/tenis-olympikus-venus-2-feminino/12/2I2-4305-012/2I2-4305-012_zoom2.jpg?ts=1700218443&ims=326x"
    },
    {
        id:2,
        nome:"Tênis Adidas",
        descricao: "Feito com uma série de materiais reciclados, possui pelo menos 50% de conteúdo reciclado como contribuição da marca ",
        preco: 12,
        imagemUrl: "https://static.netshoes.com.br/produtos/tenis-adidas-breaknet-masculino/28/NQQ-4378-028/NQQ-4378-028_zoom2.jpg?ts=1697561389&ims=326x"
    },
    {
        id:3,
        nome:"Tênis Puma",
        descricao: "Um modelo clássico para você que busca um look mais discreto e esportivo para as atividades do dia a dia é o Tênis Puma Carina Lux L BDP",
        preco: 25,
        imagemUrl: "https://imgcentauro-a.akamaihd.net/360x360/9519562X.jpg"
    },
    {
        id:4,
        nome:"Tênis Nike",
        descricao: "A beleza dos produtos Nike é algo indiscutível, por isso se você prioriza estar estilosa nos mais diversos locais o tênis Downshifter 12 é ideal.",
        preco: 23,
        imagemUrl: "https://static.netshoes.com.br/produtos/tenis-nike-flex-experience-run-11-next-nature-masculino/08/JD8-4821-008/JD8-4821-008_zoom1.jpg?ts=1700587572&ims=326x"
    },
    {
        id:5,
        nome:"Tênis Nike Court",
        descricao: "Um modelo clássico dos anos 80, o Nike Court Vision Low Next Nature é muito versátil e permite looks modernos",
        preco: 22,
        imagemUrl: "https://static.netshoes.com.br/produtos/tenis-nike-renew-ride-3-masculino/06/2IC-8513-006/2IC-8513-006_zoom1.jpg?ts=1700151426&ims=326x"
    },
])
</script>


<template>
    <div class="container">
      <input type="text" class="form-control" placeholder="Buscar">
      <div class="row">
        <div class="col-lg-3 col-md-6 col" v-for="produto in produtos" :key="produto.id">
          <ApresentacaoProduto :produto="produto"/>
        </div>
      </div>
    </div>
  </template>