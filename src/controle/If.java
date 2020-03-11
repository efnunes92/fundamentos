package controle;

import java.util.Locale;
import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0 && media <= 10.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabens!");
		}else if (media < 7 && media >= 0) {
			System.out.println("Reprovado!");
		}else
			System.out.println("Média inválida!");
		
		entrada.close();
	}

}
