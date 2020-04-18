package DesafiosSegundaVez;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(){
    }

    Produto(String nomeInicial){
        this.nome = nomeInicial;

    }

    Produto(String nomeInicial, double precoInicial){
        this.nome = nomeInicial;
        this.preco = precoInicial;

    }

    double precoComDesconto(){
        return preco - (preco * desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco - (preco * (desconto + descontoDoGerente));
    }
}
