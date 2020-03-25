package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
       // dia = 1;
       // mes = 1;
       // ano = 1970;
        this(1, 1, 1970); // construtor dentro de outro...
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String obterDataFormatada() {
        final String formato = "%d/%d/%d";
        return String.format(formato, this.dia, mes, ano); // melhor forma de fazer
    }

    void imprimirDataFormatada(){
        System.out.printf("%d/%d/%d\n", dia, mes, ano);
    }

    void imprimirDtFormatada(){
        System.out.println(this.obterDataFormatada());
    }
}

