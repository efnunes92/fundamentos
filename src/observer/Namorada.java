package observer;

public class Namorada extends ChegadaAniversarianteObserver {

    public void chegou(ChegadaAniversarianteEvent event){
        System.out.println("Apagar as luzes...");
        System.out.println("Fazer Silêncio...");
        System.out.println("Surpresa...");

    }

}
