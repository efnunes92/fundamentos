package fundamentos;

public class DesafiosAritmeticos {
	
	public static void main(String[] args) {
		
		double parteA = (6 * (3+2));
		double parteB = 3 * 2;
		double parteA2 = Math.pow(parteA, 2);
		double parteAB = parteA2 / parteB;
		double parteC = (1 - 5) * (2 - 7) / 2;
		double parteC2 = Math.pow(parteC, 2);
		double parteD = parteAB - parteC2;
		double parteE = Math.pow(parteD, 3);
		double parteF = Math.pow(10, 3);
		double parteG = parteE / parteF;
		
		System.out.println(parteG);

	}

}
