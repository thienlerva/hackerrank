package twomax;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        Integer[] arr = {2,5,6,1,7};
        twoMaxNum(arr);
    }

    static void twoMaxNum(Integer[] arr) {

        Integer maxOne=0, maxTwo =0;

        for (Integer n : arr) {

            if (maxOne < n) {
                maxTwo = maxOne;
                maxOne = n;
            } else if (maxTwo < n){
                maxTwo = n;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(maxOne + " , " + maxTwo);
    }
}
