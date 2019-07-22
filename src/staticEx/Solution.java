package staticEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    private static Integer H;
    private static Integer B;
    private static boolean flag;

    static {
        try {
            Scanner scan = new Scanner(System.in);

            B = Integer.parseInt(scan.nextLine());

            H = Integer.parseInt(scan.nextLine());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        if (B < 0 || H <0) {
            throw new IllegalArgumentException("Breadth and height must be positive");
        } else {
            flag = true;
        }

    }

    public static void main(String[] args) {
        if (flag) {
            System.out.println(B*H);
        }

        int a = 10;
        String b = String.valueOf(a);
    }
}
