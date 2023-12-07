<!-- AVISO
necessário fazer a transferencia do objeto a ser apresetnado como parametro, o idieal é buscar o produt odo banco de dados
falei com o fabiano e a forma mais facil e recomendad é pedindo apenas a id como parametro e efetuar o fetch ou axios para buscar as informacoes
do banco de dados e apresentar na tela. -->

<script setup>
import Api from './Api';
import {ref} from 'vue'

const produto = ref({})

const props = defineProps({
    id: Number
})

function buscar() {
    Api.fazer("http://localhost:8080/produtos/id?id=" + props.id).then((data) =>{
        produto.value = data;
    })
};

buscar();
</script>

<template>
    <div class="container text-white">
        
            <div class="bg-dark bg-dark-gradient rounded-3 p-3">
                <img class="w-25" :src="produto.imagem.url" alt="">
                <h2>{{ produto.nome }}</h2>
                <h2>{{ produto.descricao }}</h2>
                <h2>R$ {{ produto.valor }}</h2>
                <button class="btn btn-outline-light p-2">efetuar compra</button>
            </div>
        </div> 
</template>