package sorting;

import java.util.Arrays;

public class BubbleSort {

    static Integer[] sort(Integer[] arr) {

        for (int i = 0; i < arr.length -1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    Integer temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = RandomUtil.randomArray(10, 100);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(BubbleSort.sort(arr)));
    }
}
