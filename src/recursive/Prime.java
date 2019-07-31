package recursive;

import java.util.*;

public class Prime {

    public static boolean isPrime(int num) {
        if (num < 2) {
            throw new IllegalArgumentException("Have to be more than 2");
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private final int num;

    public Prime() {
        this.num = 5;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            String result = isPrime(i) ? String.valueOf(i) : null;
            System.out.println(result);
        }

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>(list);
        Collection<String> strings = new LinkedList<>();
    }
}
