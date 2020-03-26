package exercicios.iniciante;

public class SalarioTeste {
    public static void main(String[] args) {
        Salario u1 = new Salario(5780.94);

        u1.calcular();
        System.out.println(u1.apresentar());
    }
}
