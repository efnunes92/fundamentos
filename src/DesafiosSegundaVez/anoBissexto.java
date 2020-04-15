package DesafiosSegundaVez;

import java.util.Locale;
import java.util.Scanner;

public class anoBissexto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o ano para verificação: ");
        int ano = entrada.nextInt();
        double resto = ano % 4;

        if (resto == 0){
            System.out.println("O ano " + ano + " é bissexto.");
        }else
            System.out.println("O ano " + ano + " não é bissexto.");

        entrada.close();
    }

}
