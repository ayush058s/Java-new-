package Collections;

import java.util.*;

// Comparator helps to build custom sort method

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

//class MyComparator implements Comparator<Integer>{
//
//    @Override
//    // if int is -ve i1 will come before i2
//    // if int is +ve i1 will after i2
//    public int compare (Integer i1, Integer i2) {
//        return i1 - i2;
//    }
//}
public class Comparator02 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.sort((a, b) ->  b - a);
        // a-b -> asc
        // b-a -> des

        System.out.println(list1);

        List<String> fruits = Arrays.asList("Banana", "Apple", "date"); // we cannot add ele but replace
        fruits.sort(new StringLengthComparator());
        System.out.println(fruits);


        /*
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa);
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed();
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);


        students.sort(comparator);


        */
    }
}
