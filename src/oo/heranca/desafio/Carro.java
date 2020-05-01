package oo.heranca.desafio;

public class Carro {
    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual = 0;
    private int velocidade = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + getVelocidade() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getVelocidade();
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void frear() {
        if (velocidadeAtual >= velocidade) {
            velocidadeAtual -= velocidade;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + "Km/h.";
    }
}
