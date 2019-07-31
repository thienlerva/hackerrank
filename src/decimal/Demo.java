package decimal;

public class Demo {

    static void toBinary(int num) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int remainder = num%2;
            sb.append(remainder);
            num = num/2;
        }

        System.out.println(sb.reverse());

    }

    static int toDecimal(int num) {
        if (num < 0) { throw new IllegalArgumentException("no"); }
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.reverse();
        int total =0;
        for (int i = 0; i<sb.length();i++) {
            Character first = sb.charAt(i);
            int n = Integer.valueOf(first.toString());
            int p = (int) Math.pow(2, i);
            total +=  (n * p);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(20));
        toBinary(20);
            System.out.println(toDecimal(1010));
        System.out.println(Integer.parseInt("1010", 2));
        String s = "one" + 1 +2 + "two";
        System.out.println(s);

        String one = "Random";
        String two = "RAndom";

        String answer = one==two ? "one==two" : "one!=two";
        System.out.println(answer);

        String s1 = new String("Random");
        String s2 = new String("Random");
        String s3 = s1==s2 ? "one==two" : "one!=two";
        System.out.println(s3);

        IFruit i = new Fruit();
        System.out.println(i.getClass());
        //System.out.println(Fruit.type);

        System.out.println(Fruit.NAME);

        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1==i2);

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3==i4);
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(Test.a);
    }
}

//interface IFruit {
//    String type = "Apple";
//}
//
//class Fruit implements IFruit {
//
//}

class IFruit {
    protected static String NAME = "Apple";
}

class Fruit extends IFruit {}

 class Test {
    static int a = 1111;

    static {
        a = a-- - --a;
    }

     {a = a++ + ++a;}

}
