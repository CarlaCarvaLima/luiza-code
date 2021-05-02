package pratica03_04;

public class Compra {

    Pessoa pessoa;
    Produto produto;

    public Compra() {
    }

    public Compra(Pessoa pessoa, Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void comprar(Pessoa pessoa, Produto produto) {
        System.out.printf("\nParabéns %s! Você adicionou o produto %s no carrinho: ", pessoa.getNome(), produto.getNome());

    }

    public void verificarCompra(int confirmar) {
        if (confirmar == 1) {
            System.out.printf("\nCompra realizada!");;
        } else {
            System.out.printf("\nTudo bem! Esperamos que você volte em breve!");;
        }
    }
}