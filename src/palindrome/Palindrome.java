package palindrome;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a word: ");
            String input = scan.nextLine();

            StringBuilder sb = new StringBuilder(input);
            String answer = sb.reverse().toString().equalsIgnoreCase(input) ? "Yes" : "No";
            System.out.println(answer);
        } catch (InputMismatchException e) {
            e.getMessage();
        }
    }
}
