package DesafiosSegundaVez;

public class DataTeste {

    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 15;
        d1.mes = 04;
        d1.ano = 1992;

        Data d2 = new Data();

        String dataFormatada1 = d1.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(d2.obterDataFormatada());
    }
}
