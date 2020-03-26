package exercicios.iniciante;

import java.util.Scanner;
public class AnteSuceTeste {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o número: ");
        AnteSuce n1 = new AnteSuce(entrada.nextInt());

        n1.verificar();
        System.out.println(n1.apresentar());

    }
}
