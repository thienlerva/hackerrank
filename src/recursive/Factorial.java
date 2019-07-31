package recursive;

public class Factorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    static int fact(int num) {
        int total = num;
        for (int i = num-1; i > 0; i--) {
            total *= i;
        }
        return total;
    }

    public static void main(String[] args) {

        System.out.println(factorial(15));
        System.out.println(fact(15));
    }
}
