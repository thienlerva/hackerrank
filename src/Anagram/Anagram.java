package Anagram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Anagram {

    public static void main(String[] args) {

        //System.out.println(isAnagram("Anagramm", "marganaa"));

        List<Integer> list = Arrays.asList(3,6);

        List<String> listA = Arrays.asList("a");
        List<String> listB = Arrays.asList("a", "b");

        System.out.println(listA.stream().allMatch(s -> listB.contains(s)));

        System.out.println(list.stream().allMatch(n -> n % 3 ==0));
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String[] arrayA = a.split("");
        String[] arrayB = b.split("");

        Set<String> setA = Arrays.stream(arrayA).map(String::toLowerCase).collect(Collectors.toSet());

        Set<String> setB = Arrays.stream(arrayB).map(String::toLowerCase).collect(Collectors.toSet());
        return setA.equals(setB);



    }
}
