package DesafiosSegundaVez;

import java.util.Locale;
import java.util.Scanner;

public class DesafioParEntre0e10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();

        if(numero >= 0 && numero <= 10){
            double resto = numero % 2;
            if (resto == 0){
                System.out.printf("O número %.2f é par", numero);
            }else
                System.out.printf("O número %.2f é impar", numero);
        }else
            System.out.println("Você digitou um número fora de range.");
    }
}
