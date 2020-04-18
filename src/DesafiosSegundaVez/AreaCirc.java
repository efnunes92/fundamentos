package DesafiosSegundaVez;

public class AreaCirc {
    double raio;
    final static double pi = 3.14;

    AreaCirc(double raioInicial){
        this.raio = raioInicial;
    }

    double area(){
        return pi * Math.pow(raio, 2);
    }

    static double area(double raio){
        return pi * Math.pow(raio, 2);
    }
}
