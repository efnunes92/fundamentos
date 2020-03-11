package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Entre com o valor: ");
		double valor = entrada.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.printf("O valor %.2f ao QUADRADO é %.2f e ao CUBO %.2f", valor, quadrado, cubo);
		
		entrada.close();
		
	}

}
