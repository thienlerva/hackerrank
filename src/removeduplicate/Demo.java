package removeduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,3,4};

        Set<Integer> set = new HashSet<>();

        set = Arrays.stream(arr).collect(Collectors.toSet());

        Integer[] newArray = new Integer[set.size()];
        newArray = set.toArray(newArray);
        System.out.println(Arrays.toString(newArray));

        Integer[] arr1 = {3,4};
        Integer[] arr2 = {4,5,6};
        commonElement(arr1, arr2);

        System.out.println("Hello".substring(4,5));
    }

    static void commonElement(Integer[] arr1, Integer[] arr2) {

        List<Integer> list1 = Stream.of(arr1).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(arr2).collect(Collectors.toList());

        List<Integer> common = list1.stream().filter(list2::contains).collect(Collectors.toList());

        common.forEach(System.out::println);
    }
}
