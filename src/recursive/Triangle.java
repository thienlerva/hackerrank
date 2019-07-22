package recursive;

public class Triangle {

    static void print(int side) {
        if (side < 1) return;
        print(side-1);
        for (int i = 0; i<side;i++) {
            System.out.println("[]");
        }
        System.out.println();
    }
}
