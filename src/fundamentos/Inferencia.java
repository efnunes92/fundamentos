package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; // declara��o e inicializa��o da vari�vel 
		System.out.println(a);
		
		a = 12; 
		System.out.println(a);
		
		// a = "...";
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		// c = 4.5;
		
		c = "Outro texto";
		System.out.println(c);
		
		double d; // vari�vel foi declarada
		d = 123.65; // vari�vel foi inicializada
		System.out.println(d); // usada!
		
		var e = 123.45;
		System.out.println(e);
		
		var f = 12; // inteiro
		// f = 12.01;
		System.out.println(f);
	}

}
