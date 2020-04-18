package DesafiosSegundaVez;

import java.util.Locale;
import java.util.Scanner;

public class CalcNotas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas notas quer informar? ");
        int qtd = entrada.nextInt();
        double[] notas = new double[qtd];

        for(int contador = 0; contador < notas.length; contador++){

            System.out.print("Digite a nota " + (contador + 1) + ": ");
            notas[contador] = entrada.nextDouble();
        }

        double total = 0;
        for(double nota : notas){
            total += nota;
        }

        System.out.println("A média " + (total / notas.length ));
        entrada.close();

    }
}
