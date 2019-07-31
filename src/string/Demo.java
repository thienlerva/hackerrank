package string;

import javax.sql.RowSet;
import java.sql.SQLException;
import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {

        String a = "hello";
        String b = "hello";

        String c = new String("hello");
        String d = new String("hello");

        System.out.println(a==b);
        System.out.println(c==d);

    }
}
