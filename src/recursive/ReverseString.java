package recursive;

public class ReverseString {

    static String reverse(String input) {

        if (input.length() <= 0) {
            return "";
        }
        return input.substring(input.length()-1, input.length()) + reverse(input.substring(0, input.length()-1));

    }

    public static void main(String[] args) {

        System.out.println(reverse("Hello"));
    }
}
