package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;
    private int velocidadeDoAr = 0;

    public Ferrari(){
        this(315);
    }

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        setVelocidade(15);
    }

    public void setVelocidadeDoAr(int velocidadeDoAr) {
        this.velocidadeDoAr = velocidadeDoAr;
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
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

    public int getVelocidade(){

        if(ligarTurbo && !ligarAr){
            return 35;
        }else if(ligarTurbo && ligarAr){
            return 30;
        }else if(!ligarTurbo && !ligarAr){
            return 20;
        }else{
            return 15;
        }
    }
}
