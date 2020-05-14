package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> somar = (ac, n) -> ac + n;

        Integer total1 = nums.stream().reduce(somar).get();
        System.out.println(total1);

        Integer total2 = nums.parallelStream().reduce(0, somar);
        System.out.println(total2);

        Integer total3 = nums.parallelStream().reduce(100, somar);
        System.out.println(total3);

        Integer total4 = nums.stream().reduce(100, somar);
        System.out.println(total4);

        nums.stream()
                .filter(n -> n > 5)
                .reduce(somar)
                .ifPresent(System.out::println);
    }
}
