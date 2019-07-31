package duplicateCharacter;

import java.util.HashSet;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {

        System.out.println(findFirstDuplicateCharacter("ABC"));
    }

    static String findFirstDuplicateCharacter(String input) {

        Set<String> set = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            if (set.contains(String.valueOf(input.charAt(i)))) {
                return String.valueOf(input.charAt(i));
            } else {
                set.add(String.valueOf(input.charAt(i)));
            }
        }

        return null;
    }
}
