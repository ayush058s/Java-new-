package oops.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(1, 88.50f);
        Student st2 = new Student(22, 70.11f);
        Student st3 = new Student(30, 90.56f);
        Student st4 = new Student(14, 86.29f);
        Student st5 = new Student(12, 100.00f);

        Student[] arr = {st1, st2, st3, st4, st5};

        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.score - o2.score);
            }
        });

        Arrays.sort(arr, ((o1, o2) -> -(int)(o1.score - o2.score)));

        System.out.println(Arrays.toString(arr));

        if(st1.compareTo(st2) > 0){
            System.out.println("st1 has less than st2");
        }else{
            System.out.println(st1.compareTo(st2));
        }
    }
}
