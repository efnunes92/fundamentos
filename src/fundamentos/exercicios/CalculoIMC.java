package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Entre a altura: ");
		double altura = entrada.nextDouble();
		System.out.print("Entre com o peso: ");
		double peso   = entrada.nextDouble();
		
		
		double imc = peso / (altura * altura);
		
		System.out.printf("O valor do IMC é %.2f", imc);
		
		entrada.close();
		
	}
	
}
