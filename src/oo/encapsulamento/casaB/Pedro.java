package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();

    void testeAcessos(){
        //System.out.println(mae.segredo);
        //System.out.println(mae.facoDentroDeCasa);
        System.out.println(formaDeFalar); // recebidos por herança
        System.out.println(new Ana().todosSabem); // recebidos por herança
    }
}
