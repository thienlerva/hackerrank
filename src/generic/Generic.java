package generic;

public class Generic<T> {

    T obj;

    public Generic(T o) {
        this.obj = o;
    }

    public T getObj() {
        return this.obj;
    }

    public static void main(String[] args) {
        Generic<Integer> integerGeneric = new Generic<>(3);
        System.out.println(integerGeneric.getObj());

        Generic<String> stringGeneric = new Generic<>("hello");
        System.out.println(stringGeneric.getObj());
    }
}
