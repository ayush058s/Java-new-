package oops.Static_02;

// static does not depend on object
// therefore they are resolve at compile time
// the outer class can not be static
public class InnerClasses {
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Test{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        Test test = new Test("Hello");
        Test test2 = new Test("World");

        System.out.print(test.name + " ");
        System.out.println(test2.name);

        System.out.println(test);
    }
}
