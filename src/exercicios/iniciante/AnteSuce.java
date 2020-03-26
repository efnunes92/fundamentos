package exercicios.iniciante;

public class AnteSuce {
    int numero;
    int antecessor;
    int sucessor;

    AnteSuce(int numero){
        this.numero = numero;
    }

    void verificar(){
        antecessor = numero - 1;
        sucessor = numero + 1;
    }

    String apresentar(){
        return "O numero digitado foi " + numero + " Seu antecessor é " + antecessor + " seu sucessor é " + sucessor;
    }
}
