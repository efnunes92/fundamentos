package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); // convertendo numero para string 
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); // convertendo numero para string usando Integer.toString(num2)
		
		System.out.println(("" + num1).length()); //não usar
		System.out.println(("" + num2).length()); //não usar
		
	}

}
