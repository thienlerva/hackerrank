package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {

        IntPredicate intPredicate = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value >= 18;
            }
        };

        Predicate<Integer> predicate = i -> i>=18;


        Integer[] i = {2,6,18,19};
        System.out.println(sumWithCondition(Arrays.asList(i), predicate));

        BinaryOperator<Integer> operator = (integer, integer2) -> integer + integer2;
        System.out.println(calculateBinaryOperation(2,3, operator));

    }

    static long sumWithCondition(List<Integer> integers, Predicate<Integer> predicate) {
        return integers.parallelStream()
                .filter(predicate)
                .mapToInt(Integer::intValue)
                .sum();
    }

    static int calculateBinaryOperation(int a, int b, BinaryOperator<Integer> operator) {
        return operator.apply(a, b);
    }
}
