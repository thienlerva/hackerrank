package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "A");
         Set<String> set = new HashSet<>();
        Set<String> dup = list.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
        System.out.println(dup);
    }
}
