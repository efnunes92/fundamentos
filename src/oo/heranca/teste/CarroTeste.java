package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {

        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari();

        ferrari.ligarTurbo();

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

        ferrari.desligarTurbo();

        System.out.println(civic);
        System.out.println(ferrari);

        civic.ligarAr();
        System.out.println(civic.velocidadeDoAr());

        civic.desligarAr();
        System.out.println(civic.velocidadeDoAr());

        ferrari.ligarAr();
        ferrari.aumentarAr();
        ferrari.aumentarAr();
        ferrari.aumentarAr();
        ferrari.aumentarAr();
        ferrari.aumentarAr();
        ferrari.aumentarAr();
        ferrari.diminuirAr();
        ferrari.diminuirAr();
        ferrari.diminuirAr();
        ferrari.diminuirAr();
        ferrari.diminuirAr();
        System.out.println(ferrari.velocidadeDoAr());

        ferrari.desligarAr();
        System.out.println(ferrari.velocidadeDoAr());
    }
}
