package singleton;

public class Singleton {

    private static Singleton singleton;
    private String str;

    private Singleton() {
        str = "Hello I am a singleton! Let me say hello world to you";
        System.out.println(str);
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
        Singleton.getInstance();
    }
}
