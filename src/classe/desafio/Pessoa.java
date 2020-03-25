package classe.desafio;

public class Pessoa {
    String nome;
    double peso;

    public Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public void Comer(Comida comida){
        if(comida != null){
            this.peso += comida.pesoComida;
        }
    }

    public String apresentar(){
        return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
    }
}



