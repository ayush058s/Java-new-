package oops.Static_02;

// will see how to initialize static variable;
public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once, when the first obj is created i.e. when the class is loaded for 1st time
    static {
        System.out.println("Static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(a + " " + b );

        b += 5;
        System.out.println(b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(a + " " + StaticBlock.b);
    }
}
