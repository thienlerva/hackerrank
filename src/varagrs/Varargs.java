package varagrs;

public class Varargs {

    public static void main(String[] args) {
        System.out.println(add(1,2,3,4));
    }

    static Integer add(int...n) {
        Integer total = 0;
        for (int i = 0; i < n.length; i++) {
            total += n[i];
        }
        return total;
    }
}
