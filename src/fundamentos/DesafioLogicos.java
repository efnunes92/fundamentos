package fundamentos;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean terca = false;
		boolean quinta = false;
		
		boolean comprouTV50 = terca && quinta;
		System.out.println("Comprou Tv 50\"? " + comprouTV50);
		
		boolean comprouTV32 = terca ^ quinta;
		System.out.println("Comprou Tv 32\"? " + comprouTV32);
		
		boolean comprouSorvete = terca || quinta;
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		
		System.out.println("Mais saudável? " + !comprouSorvete);
		
		
		
		
		
		//if (terca && quinta)
		//	System.out.println("Comprar TV 50 Polegadas\nTomar sorvete");
			
		//else if (terca ^ quinta)
		//	System.out.println("Comprar TV 32 Polegadas\nTomar sorvete");
		
		//else
		//	System.out.println("Todos com fome");
				
		
			
	}
	
}
