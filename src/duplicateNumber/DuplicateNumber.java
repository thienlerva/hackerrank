package duplicateNumber;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumber {

    public List<Integer> findDuplicateNumber(List<Integer> numbers) {
        List<Integer> result;

        Map<Integer, Integer> map = numbers.stream().collect(Collectors.toMap(Function.identity(), Integer::intValue,
                (n1, n2) -> n1));

        Set<Integer> allItem = new HashSet<>();
        Set<Integer> dup = numbers.stream().filter(n -> !allItem.add(n)).collect(Collectors.toSet());
        result = new ArrayList<>(dup);
        return  result;
    }

    static boolean arrayContainsDuplicate(int[] input) {
        Set<Integer> set = new HashSet<>();

        for (int i : input) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] input = {2,1,9,2};
        System.out.println(arrayContainsDuplicate(input));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(i);
        }
        list.add(20);
        list.add(10);
        DuplicateNumber duplicateNumber = new DuplicateNumber();
        System.out.println(duplicateNumber.findDuplicateNumber(list));

        List<Integer> dup = Arrays.asList(1,2,3,1,4,2);

        Set<Integer> allItems = new HashSet<>();
        Set<Integer> duplicates = dup.stream().filter(n -> !allItems.add(n)).collect(Collectors.toSet());
        System.out.println(duplicates);

        int[] a = {1,2,3,2,3};
        Set<Integer> set = Arrays.stream(a).boxed().collect(Collectors.toSet());
        int[] b = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(b));

        System.out.println("A".compareTo("A"));
    }
}
