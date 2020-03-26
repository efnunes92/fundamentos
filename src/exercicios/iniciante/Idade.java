package exercicios.iniciante;

public class Idade {
    int ano;
    int mes;
    int dia;
    int anoCalc;
    int mesCalc;


    Idade(int ano, int mes, int dia){
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    int calculardias(){
        return (this.anoCalc = ano * 365) + (this.mesCalc = mes * 30) + dia;
    }

    String apresentar(){
        return ano + " anos, " + mes + " meses e " + dia + " dias = " + calculardias() + " dias.";
    }
}
