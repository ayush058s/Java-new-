package oops.inheritance;

// every class inherits object class
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l + box1.h +  box1.w); // -3

        Box box2 = new Box(6);
        System.out.println(box2.l + box2.h +  box2.w);// 18

        Box box3 = new Box(box1);
        System.out.println(box3.l + box3.h +  box3.w); // -3


        // BoxWeight inherits th variables of Box
        BoxWeight weight1 = new BoxWeight();
        System.out.println(weight1.l + " " + weight1.weight);


        // what we can access is determined by reference(SuperClass) i.e. Box not the object i.e BoxWeight
        Box box4 = new BoxWeight(1, 2, 3, 4);
//        System.out.println(box4.weight);

    }

    /* types
        single inheritance
        multilevel inheritance
        multiple inheritance => does not exist in java => 1 class extends more than 1 classes(interfaces)
        hierarchical => 1 class is extended by many
        hybrid => not in java as it is a combination of single and multiple (interfaces)
    * */
}
