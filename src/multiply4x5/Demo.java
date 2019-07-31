package multiply4x5;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static List<String> multiplyto20(int[] a) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i +1; j<a.length;j++) {
                if (a[i]*a[j]==20) {
                    result.add(a[i] + "x" + a[j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] arg) {
        int[] a = {1,2,4,6,5,10,20};
        System.out.println(multiplyto20(a));
    }
}
