package maxstring;

import java.util.*;
import java.util.regex.Pattern;

public class Demo {

    public static void main(String[] args) {
        //maxString("baca");

        //System.out.println(Pattern.matches("[ac]*", "acd"));

        //System.out.println("abccA d".chars().filter(Character::isLetter).map(Character::toLowerCase).distinct().count());

        List<String> word = Arrays.asList("a", "b", "ab");
        //System.out.println("abd".chars().allMatch(word::contains));
        //System.out.println("aca".contains("ca"));

        Set<String> set = new HashSet<>(word);
        List<String> list = new ArrayList<>(set);
        list.toArray();
        System.out.println(Arrays.toString(set.toArray()));
        System.out.println(set);
        System.out.println(list);
    }


    Integer num;

    static int maxString(String word) {

        Demo d = new Demo();
        d.num = 5;
        String[] subWord = word.split("");

        List<String> subStringList = new ArrayList<>();

        for (int i = 0; i<subWord.length-1; i++) {
            for (int j = i + 1; j < subWord.length+1; j++) {
                subStringList.add(word.substring(i,j));
            }
        }

        Collections.sort(subStringList);

        String[] subStringArray = subStringList.toArray(new String[0]);

        Map<String, Integer> wordMap = new HashMap<>();

        int value;
        String key;

        for (int i = 0; i < subStringArray.length - 1; i++) {
            for (int j = i+1; j < subStringArray.length; j++) {
                key = subStringArray[i];
                if (key.contains(subStringArray[j]) || subStringArray[j].contains(key)) {
                    value = wordMap.containsKey(key) ? wordMap.get(key) : 0;
                    wordMap.put(key, ++value);

                }
            }
        }

        System.out.println(wordMap);
        System.out.println(wordMap.entrySet());
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordMap.entrySet());
        System.out.println(list);

        //System.out.println("a".contains("ac"));
//        int maxLength = 0;
//        int maxOne =0;
//        int maxTwo = 0;
//        int index = 0;
//        for (int i = 0; i<subStringArray.length-1; i++) {
//            for (int j = i + 1; j < subStringArray.length; j++) {
//                if (subStringArray[i].contains(subStringArray[j]) || subStringArray[j].contains(subStringArray[i])) {
//                    if (subStringArray[i].length()>maxLength) {
//                        if ()
//                        maxLength = subStringArray[i].length();
//                        maxOne = 1;
//                        System.out.println(subStringArray[i]);
//                    } else {
//                        max += 1;
//                        index = i;
//                    }
//                }
//            }
//        }



        System.out.println(subStringList);
        return 1;
    }
}
