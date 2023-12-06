<script setup>

const props = defineProps({
    produto: Object
})
</script>

<template>
        <div class="container bg-dark rounded-3 m-3 text-white">
            <img class="img-fluid w-50 rounded-3" :src="props.produto.imagemUrl" alt="">
            <hr>
            <h2>{{props.produto.nome}}</h2>
            <p>{{ props.produto.descricao }}</p>
            <p><strong>R$ {{ props.produto.preco }}</strong></p>

            <div class="d-flex pb-3">
                <button class="btn btn-outline-info me-2">Comprar</button>
                <router-link to="/produto/id">
                    <button class="btn btn-outline-info ms-2">Ver</button>
                </router-link>
            </div>
        </div>
</template>