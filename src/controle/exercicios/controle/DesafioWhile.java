package controle.exercicios.controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valor = 0;
		int invalidas = 0;
		int validas = 0;
		double total = 0;
		double media = 0;
		
		while(valor != -1) {
			System.out.print("Digite a nota do aluno: ");
			valor = entrada.nextDouble();
			if (valor > 10 || valor < 0) {
				invalidas += 1;
				System.out.println("Digite uma nota v�lida!");
			} else
				validas += 1;
				total += valor;
		}
		
		media = total / validas;
		System.out.printf("M�dia das notas v�lidas: %.2f\n", media);
		System.out.println("Quantidade de notas v�lidas: " + validas);
		System.out.println("Quantidade de notas inv�lidas: " + invalidas);
		
	}

}
