package exercicios.iniciante;

public class IdadeTeste {
    public static void main(String[] args) {

        Idade i1 = new Idade(3, 2,15);
        Idade i2 = new Idade(27, 2, 25);

        i1.calculardias();
        System.out.println(i1.apresentar());

        i2.calculardias();
        System.out.println(i2.apresentar());
    }
}
