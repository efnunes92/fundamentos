package exercicios.iniciante;

public class PecasTeste {
    public static void main(String[] args) {

        double total = 0.0;

        Pecas p1 = new Pecas(1 , 12.99, 3);
        Pecas p2 = new Pecas(2, 3.57, 13);

        total  = p1.calcular() + p2.calcular();
        System.out.printf("O valor total a ser pago é %.2f", total);

    }
}
