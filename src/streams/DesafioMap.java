package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Modo que eu fiz...");

        Function<Integer, String> numero =
                num -> Integer.toBinaryString(num);
        Function<String, String> inverter =
                num -> new StringBuilder(num).reverse().toString();
        Function<String, Integer> reInverter =
                num -> Integer.parseInt(num, 2);

        nums.stream()
                .map(numero)
                .map(inverter)
                .map(reInverter)
                .forEach(System.out::println);

        System.out.println();



        System.out.println("Modo que o professor fez...");

        UnaryOperator<String> invert =
                s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> binParaInt =
                num -> Integer.parseInt(num, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(invert)
                .map(binParaInt)
                .forEach(System.out::println);
    }
}
