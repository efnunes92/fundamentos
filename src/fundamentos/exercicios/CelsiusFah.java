package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CelsiusFah {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Entre com o valor em Celsius: ");
		double celsius = entrada.nextDouble();
		
		double fah = (celsius * 9 /5) + 32;
		
		System.out.printf("O valor da conversão é %.2f", fah);
		
		entrada.close();
	}

}
