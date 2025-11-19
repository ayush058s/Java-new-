package oops.polyMorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    // By default,it extends object class and overrides the default toString method
    // it is decided at runtime
    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }


    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(10);
        System.out.println(obj);
    }


}
