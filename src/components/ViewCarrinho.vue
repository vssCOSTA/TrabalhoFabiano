<script setup>  </script>
<template>
   
    <div class="container">
        <div class="cart-container">
            <header>
                <h3>Carrinho de Compras</h3>
            </header>
            <div class="cart-item">
                <div class="cart-row">
                    <div class="cart-row-cell pic">
                        <a href="#">-</a>
                    </div>
                    <div class="cart-row-cell desc">
                        <h5>Gabinete Gamer</h5>
                        <p>#41345755</p>
                    </div>
                    <div class="cart-row-cell quant">
                        <ul>
                            <li><a href="#">-</a></li>
                            <li>2</li>
                            <li><a href="#">+</a></li>
                        </ul>
                    </div>
                    <div class="cart-row-cell amount">
                        <p>R$13,87</p>
                    </div>	
                </div>
                <!-- Adicione mais itens do carrinho aqui -->
            </div>
            <footer>
                <div class="totals">
                    <p class="total-label">Subtotal</p>
                    <p class="total-amount">R$13,87</p>
                </div>
                <div class="totals">
                    <p class="total-label">Taxa</p>
                    <p class="total-amount">R$2,00</p>
                </div>
                <div class="totals">
                    <p class="total-label">Total</p>
                    <p class="total-amount">R$15,87</p>
                </div>
                <button>Finalizar Compra</button>
            </footer>
        </div>
    </div>
</template>

<style scoped>
body {
    font-family: 'Raleway', sans-serif;
    background-color: #f5f5f5;
    margin: 0;
    padding: 0;
}
.container {
    max-width: 800px;
    margin: 0 auto;
    padding: 20px;
}
.cart-container {
    background-color: #fff;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
    padding: 20px;
}
header {
    text-align: center;
}
h3 {
    color: #333;
}
.cart-item {
    margin-top: 20px;
}
.cart-row {
    display: flex;
    align-items: center;
    border-bottom: 1px solid #ccc;
    padding-bottom: 10px;
    margin-bottom: 10px;
}
.cart-row-cell {
    flex: 1;
    text-align: center;
}
.cart-row-cell a {
    text-decoration: none;
    color: #333;
    font-size: 20px;
    margin: 0 10px;
    cursor: pointer;
}
.cart-row-cell.desc h5 {
    font-size: 18px;
    margin: 0;
}
.cart-row-cell.desc p {
    color: #777;
}
.cart-row-cell ul {
    list-style: none;
    padding: 0;
    margin: 0;
    display: flex;
    align-items: center;
    justify-content: center;
}
.cart-row-cell ul li {
    margin: 0 10px;
    font-size: 18px;
    color: #333;
}
.cart-row-cell.amount p {
    font-size: 20px;
    font-weight: bold;
}
footer {
    margin-top: 20px;
    display: flex;
    justify-content: space-between;
    align-items: center;
}
.total-label {
    font-weight: bold;
}
.total-amount {
    font-size: 24px;
    color: #333;
}
button {
    background-color: #007bff;
    color: #fff;
    border: none;
    padding: 10px 20px;
    border-radius: 5px;
    font-size: 18px;
    cursor: pointer;
}
</style>