package Collections;

//import java.util.ArrayList;
import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i: list){
            System.out.println(i);
        }

        // instead of for-each loop, we can use iterator
        Iterator<Integer> iterator = list.iterator();
        while( iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> iter = numbers.iterator();

        while(iter.hasNext()){
            Integer number = iter.next();
            if(number % 2 == 0){
                iter.remove();
            }
        }
        System.out.println(numbers);

        // we can also use listIterator
        ListIterator<Integer> ListItr = numbers.listIterator();
    }
}
