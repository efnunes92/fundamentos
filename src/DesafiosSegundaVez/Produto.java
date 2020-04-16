package DesafiosSegundaVez;

public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoComDesconto(){
        return preco - (preco * desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco - (preco * (desconto + descontoDoGerente));
    }
}
