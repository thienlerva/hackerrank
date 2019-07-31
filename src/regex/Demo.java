package regex;

import java.util.regex.Pattern;

public class Demo {

    public static void main(String[] args) {

        System.out.println(Pattern.matches("\\w+","acb"));

        System.out.println("abcd".matches(".*bc.*"));

        System.out.println((int) 'b');

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i);
        }

        //System.out.println(check("Abcdefghijklmnopqrstuvwxyzz ab"));

        //print(3);
        //System.out.println(1%2);
    }

    static boolean check(String sentence) {

        for (int i = 97; i < 123; i++) {
            Character c = (char) i;

            if (!sentence.toLowerCase().contains(c.toString())) {
                return false;
            }
        }

        return true;


    }

    boolean check1(final String sentence) {
        return sentence.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }

    public boolean check2(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

    }

    public boolean check3(String sentence){
        long result = sentence.toLowerCase().chars().filter(i -> i >= 'a' && i <= 'z').distinct().count();
        return result == 26;
    }

    public static void print(int n) {
        for (int row = 1; row<=n; row++) {
            for (int column = 1; column <= n; column++) {
                if (row % 3 == 0) {
                    System.out.print("*");
                } else if (row % 2 != 0) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
