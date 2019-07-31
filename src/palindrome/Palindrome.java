package palindrome;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Madam, I'm Adam"));
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

    static boolean isPalindrome(String text) {


        if (text.length()<=1) { return true; }

        char first = Character.toLowerCase(text.charAt(0));
        char last = Character.toLowerCase(text.charAt(text.length()-1));

        if (Character.isLetter(first) && Character.isLetter(last)) {
            if (first==last) {
                String shorter = text.substring(1, text.length()-1);
                return isPalindrome(shorter);
            } else {
                return false;
            }
        }

        if (!Character.isLetter(first)) {
            String shorter = text.substring(1);
            return isPalindrome(shorter);
        }
        if (!Character.isLetter(last)) {
            String shorter = text.substring(0, text.length()-1);
            return isPalindrome(shorter);
        }
        return false;
    }
}
