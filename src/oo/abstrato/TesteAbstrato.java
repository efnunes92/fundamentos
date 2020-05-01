package oo.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {
        Mamifero doguinho = new Cachorro();
        System.out.println(doguinho.mover());
        System.out.println(doguinho.mamar());
        System.out.println(doguinho.respirar());
    }
}
