package Collections;

// iterables -> collections -> i) list ii) set iii) queue
// collection inherits iterables to use forEach
// collection and list are an interface


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// list =>> order preservation, indexed based access, duplicate value is allowed
// list is implemented by classes like arrayList, stack, vector, LinkedList
// default capacity of arrayList is 10
public class ArrayList01 {
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(11);
        // it does not mean the size, it changes the default capacity to 11 so that it will resize(1.5) itself after 11 ele

        list.add(2);
        list.add(0);
        list.add(3);
        list.add(4);

        System.out.println(list.getFirst()); // 2
        System.out.println(list.get(1)); // 0

        // size
        System.out.println("SIZE: " + list.size()); // 4

        // contains
        System.out.println(list.contains(5));
        System.out.println(list.contains(3));


        list.remove(1); // it will remove the ele with index 1
        list.remove(Integer.valueOf(3)); // it will remove the ele with value 3


        for(int i: list){
            System.out.print(i + " ");
        }
        System.out.println();
        list.add(2,50); // adds 50 at 2 index

        // for loop
        for(int i: list){
            System.out.print(i + " ");
        }
        System.out.println();

        // set()
        list.set(2,80); // it replaces the second index ele with 80
        System.out.println(list);


        // adding to the list
        List<Integer> list2 = List.of(7, 8, 9, 10);
        list.addAll(list2);
        System.out.println(list);

        //to sort the list
        Collections.sort(list);
        // or list.sort(null);

        System.out.println(list);


    }

    /*Time complexity
    i) to get ele =>  0(1)
    ii) add in worst case => 0(n)
    iii) removing => 0(n)
    iv) iteration => 0(n)
      */
}
