package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		final double var32 = 32.0;
		final double div = 5.0/9.0;
		double grausc = 0;	
		
		System.out.print("Digite o valor em °F: ");
		double grausf = sc.nextDouble();
		
		grausc = (grausf - var32) * div;
		
		System.out.printf("A conversão é igual a %.2f°C", grausc);
		
		sc.close();
		
	}
}
