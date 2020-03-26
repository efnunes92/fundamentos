package exercicios.iniciante;

public class Pecas {
    int codigoPeca;
    double valorUnitario;
    int qtdPecas;
    double ipi;
    double valorTotal;

    Pecas(int codigoPeca, double valorUnitario, int qtdPecas){
        this.codigoPeca = codigoPeca;
        this.valorUnitario = valorUnitario;
        this.qtdPecas = qtdPecas;
    }

    public double calcular() {
        ipi = (valorUnitario * qtdPecas) * 0.1;
        valorTotal = (valorUnitario * qtdPecas) + ipi;
        return valorTotal;
    }
}
