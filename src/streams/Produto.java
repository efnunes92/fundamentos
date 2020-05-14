package streams;

public class Produto {
    String nome;
    double preco;
    double frete;
    double desconto;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double valorDesconto(){
        if(this.preco <= 50){
            this.desconto = 0.9;
        }else if(this.preco > 50 && this.preco <= 100){
            this.desconto = 0.85;
        }else if(this.preco > 100 && this.preco <= 200) {
            this.desconto = 0.8;
        }else if(this.preco > 200 && this.preco <= 400) {
            this.desconto = 0.75;
        }else if(this.preco > 400 && this.preco <= 600) {
            this.desconto = 0.7;
        }else if(this.preco > 600 && this.preco <= 800) {
            this.desconto = 0.6;
        }else if(this.preco > 800 && this.preco <= 1000) {
            this.desconto = 0.5;
        }else if(this.preco > 1000 && this.preco <= 1500) {
            this.desconto = 0.4;
        }else if(this.preco > 1500 && this.preco <= 2000) {
            this.desconto = 0.35;
        }else if(this.preco > 2000 && this.preco <= 4000) {
            this.desconto = 0.3;
        }else if(this.preco > 4000) {
            this.desconto = 0.2;
        }
        return this.desconto;
    }

    private double precoComDesconto(){
        this.preco = preco * (1 - valorDesconto());
        return this.preco;
    }

    public double valorFrete(){
        this.frete = precoComDesconto() - (precoComDesconto() * (1 - 0.05));
        if(this.frete <= 30) {
            this.frete = 0.0;
        }
        return this.frete;
    }
}
