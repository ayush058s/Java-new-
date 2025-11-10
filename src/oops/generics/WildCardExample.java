package oops.generics;

import java.util.Arrays;
import java.util.List;

// here T should be a number or it's subclass
public class WildCardExample<T extends Number> {


    // <?> → any type, flexible, read-only
    // <? extends T> → upper bound, safe for reading
    // <? super T> → lower bound, safe for writing

    private Object[] array;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardExample() {
        this.array = new Object[DEFAULT_SIZE];
    }

    public static void printList(List<? extends Number> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public T remove(){
        T removed = (T)array[--size];
        return removed;
    }

    public T get(int index){
        return (T) array[index];
    }

    public void set(int index, T value){
        array[index] = value;
    }

    public int size(){
        return size;
    }

    public void add(T value) {
        if(isFull()){
            resize();
        }
        array[size++] = value;
    }

    private void resize() {
        Object[] newArray = new Object[array.length * 2];

        // copy the current items in new array
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private boolean isFull() {
        return size == array.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();

        WildCardExample<Integer> list = new WildCardExample<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        System.out.println(list);

    }


}
