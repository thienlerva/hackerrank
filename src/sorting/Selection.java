package sorting;

import queue.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Selection {

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println(num.remove(2));
        System.out.println(num);

        List<Student> students = new ArrayList<>();
        Student student = new Student("John", 3.8, 10);
        students.add(student);
        System.out.println(students.remove(student));
        System.out.println(students.size());
        Integer[] a = RandomUtil.randomArray(500000, 1000);

        StopWatch timer = new StopWatch();
        timer.start();
        //selectionSort(a);
        timer.stop();

        System.out.println("Elapsed time: " + timer.getElapsedTime() + " milliseconds");

        long start = System.currentTimeMillis();
        Arrays.sort(a);
        //selectionSort(a);
        long end = System.currentTimeMillis();
        System.out.println(end-start + " milliseconds");
    }

    static void selectionSort(Integer[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = minimumPosition(a, i);
            if (minPos != i) {
                int temp = a[i];
                a[i] = a[minPos];
                a[minPos] = temp;
            }
        }
    }

    static int minimumPosition(Integer[] a, int from) {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++) {
            if (a[minPos] > a[i]) {
                minPos = i;
            }
        }
        return minPos;
    }
}
