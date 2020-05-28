package controle.exercicios.controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana");
		String dia = entrada.next().toUpperCase().replace("C", "�").replace("�", "A").replace("FEIRA", "").replace("-", "");
		
		if ("DOMINGO".equals(dia))
			System.out.println("Dia da semana 1.");
		else if ("SEGUNDA".equals(dia))
			System.out.println("Dia da semana 2.");
		else if ("TER�A".equals(dia))
			System.out.println("Dia da semana 3.");
		else if ("QUARTA".equals(dia))
			System.out.println("Dia da semana 4.");
		else if ("QUINTA".equals(dia))
			System.out.println("Dia da semana 5.");
		else if ("SEXTA".equals(dia))
			System.out.println("Dia da semana 6.");
		else if ("SABADO".equals(dia))
			System.out.println("Dia da semana 7.");
		else
			System.out.println("Valor digitado inv�lido!");
			
		
		// Domingo -> 1
			
		
		entrada.close();
	}

}
