package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        String str1 = "A";
        String str2 = "B";



        System.out.println(str1.compareTo(str2));


        Integer[] a = RandomUtil.randomArray(5000000, 1000);

        StopWatch timer = new StopWatch();
        //timer.start();
        long start1 = System.currentTimeMillis();
        sort(a);
        //timer.stop();
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);

        long start = System.currentTimeMillis();
        Arrays.sort(a);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    static void sort(Integer[] a) {
        if (a.length <= 1) { return;}

        Integer[] first = new Integer[a.length / 2];
        Integer[] second = new Integer[a.length - first.length];

        for (int i = 0; i < first.length; i++) {
            first[i] = a[i];
        }

        for (int i = 0; i < second.length; i++) {
            second[i] = a[first.length +i];
        }

        sort(first);
        sort(second);
        merge(first,second, a);
    }

    private static void merge(Integer[] first, Integer[] second, Integer[] a) {
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;

        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }

        while (iFirst < first.length) {
            a[j] = first[iFirst];
            iFirst++; j++;
        }

        while (iSecond < second.length) {
            a[j] = second[iSecond];
            iSecond++; j++;
        }
    }
}
