package exercicios.iniciante;

public class SalarioLiquido {

    int horas;
    double salarioBruto;
    double salarioLiquido;

    SalarioLiquido(int horas, double salarioBruto){
        this.horas = horas;
        this.salarioBruto = salarioBruto;
    }

    double calcular(){
        salarioLiquido = salarioBruto * horas;
        if(salarioLiquido <= 1045.00){
            salarioLiquido = salarioLiquido - (salarioLiquido * 0.075);
        }else if(salarioLiquido > 1045.00 && salarioLiquido <= 2089.60){
            salarioLiquido = salarioLiquido - (salarioLiquido * 0.09);
        }else if(salarioLiquido > 2089.60 && salarioLiquido <= 3134.40) {
            salarioLiquido = salarioLiquido - (salarioLiquido * 0.12);
        }else
            salarioLiquido = salarioLiquido - (salarioLiquido * 0.14);
        return salarioLiquido;
    }


    void apresentar(){
        System.out.printf("O valor do salário liquido com descontos é de R$ %.2f ", salarioLiquido);
    }

}
