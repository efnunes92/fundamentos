package fundamentos;

import java.util.Locale;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - / * %
		
		Locale.setDefault(Locale.US);
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número").replace(",", ".");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número").replace(",", ".");
		String operacao = JOptionPane.showInputDialog("Digite a operação a ser realizada");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double resultado = "+".equals(operacao) ? numero1 + numero2 : 0;
		resultado = "-".equals(operacao) ? numero1 - numero2 : resultado;
		resultado = "/".equals(operacao) ? numero1 / numero2 : resultado;
		resultado = "*".equals(operacao) ? numero1 * numero2 : resultado;
		resultado = "%".equals(operacao) ? numero1 % numero2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", numero1, operacao, numero2, resultado);
		
	}
	
}
