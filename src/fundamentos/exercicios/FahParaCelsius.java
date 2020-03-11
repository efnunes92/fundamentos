package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class FahParaCelsius {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Entre com o valor em Fahrenheit: ");
		double fah = entrada.nextDouble();
		
		double celsius = (fah - 32) * 5 / 9;
		
		System.out.printf("O valor da conversão é %.2f", celsius);
		
		entrada.close();
		
	}
	
}
