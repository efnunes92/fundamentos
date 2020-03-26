package classe.desafio;

public class Pessoa {

    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nomePessoa, double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

    void comer(Comida comida){
        if(comida != null){
            this.pesoPessoa += comida.pesoComida;
        }
    }
    String apresentar(){
        return "Ola eu sou o " + nomePessoa + " e eu peso " + pesoPessoa + " Kg's";
    }
}



