package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);

        monstro.atacar(heroi);
        monstro.atacar(heroi);
        monstro.atacar(heroi);

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);

        heroi.atacar(monstro);
        heroi.atacar(monstro);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);


    }
}
