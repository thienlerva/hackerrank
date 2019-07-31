package commoninteger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static List<Integer> commonInteger(Integer[] a, Integer[] b) {

        List<Integer> lista = Arrays.asList(a);
        List<Integer> listb = Arrays.asList(b);
        return lista.stream().filter(listb::contains).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        Integer[] b = {3,4,5,6};

        Integer[] a1 = Arrays.stream(a).boxed().toArray(Integer[]::new);

        System.out.println(commonInteger(a1,b));
    }
}
