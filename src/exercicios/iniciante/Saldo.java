package exercicios.iniciante;

public class Saldo {
    double saldo;

    Saldo(double saldo){
        this.saldo = saldo;
    }

    double reajuste(){
        return saldo += saldo * 0.01;
    }

    void apresentar(){
        System.out.printf("O novo saldo é %.2f\n", saldo);
    }
}
