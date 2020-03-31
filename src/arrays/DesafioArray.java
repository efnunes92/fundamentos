package arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas você quer informar ? ");
        int quantidade = entrada.nextInt();
        double[] notas = new double[quantidade];

        for(int i = 0; i < notas.length; i++){
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for(double soma: notas){
            total += soma;
        }

        double media = total / notas.length;
        System.out.println("A média é " + media);

        entrada.close();
    }
}
