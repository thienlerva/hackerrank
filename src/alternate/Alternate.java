package alternate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Alternate {

    static private final String VOCAL = "[aeiou]";
    static private final String CONSONANT = "[^aeiou]";
    static private final Pattern ALTERNATE = Pattern.compile(
            VOCAL + "?"    // maybe starts with vocal
                    + "(" + CONSONANT + VOCAL + ")*"   // followed by any number of consonants and vocals in order
                    + CONSONANT + "?"); // maybe ends with consonant


    public static boolean isAlt2(String word) {
        return ALTERNATE.matcher(word).matches();
    }

    public static boolean isAlt1(String word) {
        return word.matches("[aeiou]?([^aeiou][aeiou])*[^aeiou]?");
    }

    public static boolean isAlt3(String word) {
        return !word.matches(".*[aeiou]{2}.*|.*[^aeiou]{2}.*");
    }

    public static boolean isAlt(String word) {
        //make note that 'y' should not be treated as vowel
        //your code here

        Set<Character> vowels = vowelSet();

        int i = 1;
        boolean isVowel = checkVowel(vowels, word.charAt(0));



        while (i < word.length()) {
            char c = word.charAt(i);
            boolean nextVowel = checkVowel(vowels, c);
            if (isVowel) {
                if (nextVowel) {
                    return false;
                }
            } else {
                if (!nextVowel) {
                    return false;
                }
            }
            isVowel = nextVowel;
            i++;
        }

        return true;

    }

    public static boolean checkVowel(Set<Character> vowels, Character c) {
        if (vowels.contains(c)) {
            return true;
        }
        return false;
    }

    static Set vowelSet() {
        Character[] c = {'a', 'i', 'o', 'u', 'e'};
        return new HashSet<>(Arrays.asList(c));
    }


    public static void main(String[] args) {
        System.out.println(isAlt("amazon"));
        System.out.println(isAlt("apple"));
        System.out.println(isAlt("banana"));

        System.out.println("banauna".replaceAll("[aeiou]", ""));
    }
}
