package DesafiosSegundaVez;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Feijão", 0.500);

        Comida c2 = new Comida();
        c2.nomeComida = "Arroz";
        c2.pesoComida = 0.300;

        Pessoa p1 = new Pessoa();
        p1.nome = "Erik";
        p1.peso = 82.5;

        System.out.println(p1.apresentar());

        p1.comer(c1);

        System.out.println(p1.apresentar());

        p1.comer(c2);

        System.out.println(p1.apresentar());
    }
}
