package DesafiosSegundaVez;

import java.util.Scanner;

public class DesafioTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double C = 0;
        System.out.print("Digite o valor da temperatuda para ser convertida: ");
        double F = entrada.nextDouble();

        C = (F - 32) * 5 / 9;

        System.out.println("A temperatura em Celcius é de " + C + " Graus");

        entrada.close();
    }
}
