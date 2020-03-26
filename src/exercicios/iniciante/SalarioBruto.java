package exercicios.iniciante;

import java.util.Scanner;

public class SalarioBruto {
    public static void main(String[] args) {
        int horas = 0;
        double salariobruto = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com as horas trabalhadas: ");
        horas = entrada.nextInt();
        System.out.print("Entre com o valor bruto por hora: ");
        salariobruto = entrada.nextDouble();
        SalarioLiquido salario = new SalarioLiquido(horas, salariobruto);

        salario.calcular();
        salario.apresentar();

        entrada.close();


    }
}
