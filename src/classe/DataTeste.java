package classe;

import java.awt.image.BandCombineOp;

public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data();
        //data1.ano = 2021;   pode modificar a data padronizada passando normal

        System.out.println(data1.obterDataFormatada());

        var data2 = new Data(16, 02, 1996);

        System.out.println(data2.obterDataFormatada());

        data1.imprimirDataFormatada();

        data2.imprimirDtFormatada();
    }
}
