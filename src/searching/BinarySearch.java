package searching;

import sorting.RandomUtil;

import java.util.Arrays;

public class BinarySearch {

    public static Integer search(Integer[] arr, int low, int high, int value) {

        if (low < high) {
            int mid = (low + high) /2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                return search(arr, mid + 1, high, value);
            } else if (arr[mid] > value) {
                return search(arr, 0, mid-1, value);
            }
        }
        return -1;
    }

    public static void main(String[] arg) {

        Integer[] arr = RandomUtil.randomArray(10, 10);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(BinarySearch.search(arr, 0, arr.length, 6));
    }
}
