export default class Carrinho {
  static produtos = this.buscarProdutos();

  static buscarProdutos() {
    const produtos = JSON.parse(localStorage.getItem("produtos"));
    return produtos ? produtos : [];
  }

  static salvarProdutos(produtos) {
    localStorage.setItem("produtos", JSON.stringify(produtos));
  }

  static adicionarProdutoCarrinho(product) {
    this.produtos.push(product);
    this.salvarProdutos(this.produtos);
  }

  static removerProdutoCarrinho(productId) {
    const posicao = this.produtos.findIndex(
      (produto) => produto.id === productId
    );
    this.produtos.splice(posicao, 1);
    this.salvarProdutos(this.produtos);
  }

  static atualizarProduto(produto) {
    this.removerProdutoCarrinho(produto.id);
    this.adicionarProdutoCarrinho(produto);
  }
}
