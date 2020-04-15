package DesafiosSegundaVez;

import java.util.Locale;
import java.util.Scanner;

public class calculoNotas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Informe a primeira nota: ");
        double nota2 = entrada.nextDouble();

        double total = (nota1 + nota2) / 2;

        if(total >= 7){
            System.out.println("Aprovado");
        }else if(total < 7 && total >= 4){
            System.out.println("Recuperação");
        }else
            System.out.println("Reprovado");
    }
}
