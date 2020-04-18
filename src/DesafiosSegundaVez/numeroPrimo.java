package DesafiosSegundaVez;

import java.util.Locale;
import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = entrada.nextInt();
        int total = numero;
        int resto = 0;
        int contador = 0;

        while(numero != 0){
            resto = total % numero;
            numero--;
            if(resto == 0){
                contador++;
            }
        }

        if(contador == 2){
            System.out.println("O número " + total + " é primo");
        }else
            System.out.println("O número " + total + " não é primo");
    }
}