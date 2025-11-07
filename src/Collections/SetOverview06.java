package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview06 {
    public static void main(String[] args) {
        // collection that cannot contain duplicate
        // 0(1) => faster operations
        //set is interface, hashSet is implementation class
        Set<Integer> set = new HashSet<>(); // will give an unordered list

        // for ordered use LinkedListHashSet<>();
        Set<Integer> Linkset = new LinkedHashSet<>();

        // for sorted list
        Set<Integer> Sortedset = new TreeSet<>();// IT IS IMPLEMENTED BY NavigableSet(more functions)


        set.add(12);
        set.add(2);
        set.add(1);
        set.add(66);
        System.out.println(set);

        // for thread safety
        Set<Integer> set1 = new ConcurrentSkipListSet<>();

        // unmodifiable set
        Set<Integer> integers = Set.of(1, 2, 3);

    }
}
