package Book3.chapter3;

public class StaticInt {
    public static int x;

    static {
        x = 32;
        System.out.println("X value from static init: "  + x);
    }

    public StaticInt(){
        System.out.println("In the constructor");
        x = 64;
    }

    public static void main(String[] args) {
        System.out.println("X value from main before initialization: " + StaticInt.x);
        StaticInt si = new StaticInt();
        System.out.println("X value from main after initialization/constructor: " + StaticInt.x);
    }
}
