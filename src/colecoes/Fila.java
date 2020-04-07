package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // offer e add -> adicionam elementos na fila, diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // retona false
        fila.offer("Bia"); // lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // retorna uma exceção
        System.out.println(fila.element());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(...);

        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // retonar null
        System.out.println(fila.remove()); // retorna exceção
    }
}
