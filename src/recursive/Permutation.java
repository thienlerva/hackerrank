package recursive;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void main(String[] args) {
        permute("eat").stream().forEach(System.out::println);
    }

    static List<String> permute(String input) {
        List<String> result = new ArrayList<>();

        if (input.length()==0) {
            result.add(input);
            return result;
        }

        for (int i = 0; i < input.length(); i++) {
            //form shorter word by removing the ith character
            String shorter = input.substring(0, i) + input.substring(i+1);

            //Generate all permutations of the simpler word
            List<String> shorterPermutation = permute(shorter);

            // Add the removed character to the font of each permutation of teh simpler word
            for (String s : shorterPermutation) {
                result.add(input.charAt(i) + s);
            }
        }
        return result;
    }
}
