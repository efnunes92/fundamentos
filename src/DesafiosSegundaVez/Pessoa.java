package DesafiosSegundaVez;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(){

    }

    Pessoa(String nome, double peso){
        this.peso = peso;
        this.nome = nome;
    }

    void comer(Comida comida){
        if (comida != null){
            this.peso += comida.pesoComida;
        }
    }
    String apresentar(){
        return String.format("Meu nome é " + nome + " e estou pesando " + peso + "kg's.");
    }
}
