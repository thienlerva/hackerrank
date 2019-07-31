package recursive;

public class ReverseString {

    static String reverse(String input) {

        if (input.length() <= 0) {
            throw new IllegalArgumentException("Wrong");
        }
        return input.substring(input.length()-1) + reverse(input.substring(0, input.length()-1));

    }

    public static void main(String[] args) {

        System.out.println(reverse("Hello"));
    }
}
