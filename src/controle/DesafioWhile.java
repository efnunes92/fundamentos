package controle;

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
				System.out.println("Digite uma nota válida!");
			} else
				validas += 1;
				total += valor;
		}
		
		media = total / validas;
		System.out.printf("Média das notas válidas: %.2f\n", media);
		System.out.println("Quantidade de notas válidas: " + validas);
		System.out.println("Quantidade de notas inválidas: " + invalidas);
		
	}

}
