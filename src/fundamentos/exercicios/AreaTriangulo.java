package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
				
		System.out.print("Entre com o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.print("Entre com o valor da altura: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("A área do triangulo é %.2f ", area);
		
		entrada.close();
	}

}
