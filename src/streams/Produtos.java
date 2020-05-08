package streams;

public class Produtos {
    String nome;
    double preco;
    double desconto;
    double frete;

    public Produtos(String nome, double preco, double desconto, double frete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
    }

    public double valorComDesconto() {
        this.preco = this.preco * (1 - this.desconto);
        return this.preco;
    }

    public double valorFrete() {
        valorComDesconto();
        double fretePreco = this.preco - (this.preco * (1 - 0.05));
        if (fretePreco <= 50.0) {
            fretePreco = 0.0;
        }
        return fretePreco;
    }
}

