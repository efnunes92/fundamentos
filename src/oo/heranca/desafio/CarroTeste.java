package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari();

        System.out.println(civic);
        System.out.println(ferrari);

        ferrari.acelerar();
        civic.acelerar();

        System.out.println(civic);
        System.out.println(ferrari);

        civic.frear();
        ferrari.frear();

        System.out.println(civic);
        System.out.println(ferrari);

        civic.frear();
        ferrari.frear();
        civic.frear();
        ferrari.frear();
        civic.frear();
        ferrari.frear();

        System.out.println(civic);
        System.out.println(ferrari);
    }
}
