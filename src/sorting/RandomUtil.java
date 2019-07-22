package sorting;

import java.util.Random;

public class RandomUtil {

    private RandomUtil() {}

    public static Integer[] randomArray(int length, int offset) {

        Integer[] arr = new Integer[length];

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(offset);
        }

        return arr;
    }
}
