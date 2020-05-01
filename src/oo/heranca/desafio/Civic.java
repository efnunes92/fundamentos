package oo.heranca.desafio;

public class Civic extends Carro implements Luxo{
    private boolean ligarAr = false;
    private int velocidadeDoAr = 0;

    public Civic(){
        super(212);
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
        setVelocidadeDoAr(1);
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
        setVelocidadeDoAr(0);
    }

    @Override
    public int velocidadeDoAr() {
        return velocidadeDoAr;
    }

    public void setVelocidadeDoAr(int velocidadeDoAr) {
        this.velocidadeDoAr = velocidadeDoAr;
    }

    public void aumentarAr() {
        if (ligarAr && velocidadeDoAr < 3) {
            velocidadeDoAr += 1;
            setVelocidadeDoAr(velocidadeDoAr);
        }
    }

    public void diminuirAr(){
        if(ligarAr && velocidadeDoAr > 0){
            velocidadeDoAr -= 1;
            setVelocidadeDoAr(velocidadeDoAr);
        }
    }
}
