package oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] array;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.array = new int[DEFAULT_SIZE];
    }

    public int remove(){
        int removed = array[--size];
        return removed;
    }

    public int get(int index){
        return array[index];
    }

    public void set(int index, int value){
        array[index] = value;
    }

    public int size(){
        return size;
    }

    public void add(int value) {
        if(isFull()){
            resize();
        }
        array[size++] = value;
    }

    private void resize() {
        int[] newArray = new int[array.length * 2];

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

        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

    }


}
