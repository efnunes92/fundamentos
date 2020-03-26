package exercicios.iniciante;

public class Salario {
    final double minimo = 788.00;
    double salario;
    int qtdSalarios;

    Salario(double salario){
        this.salario = salario;
    }

    void calcular(){
        qtdSalarios = (int) (salario / minimo);
    }

    String apresentar(){
        return "O usuário recebe " + qtdSalarios + " salários mínimos";
    }
}
