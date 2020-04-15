package DesafiosSegundaVez;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        double total = 0;
        int validas = 0;

        while(nota != -1){
            System.out.print("Insira uma nota: ");
            nota = entrada.nextDouble();
            if(nota >= 0 && nota <= 10){
                total += nota;
                validas++;
            }else if(nota != -1)
                System.out.println("A nota " + nota + " não é válida.");
        }

        System.out.println("A média da turma é " + (total / validas));

        entrada.close();
    }
}
