package oops.generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private Object[] array;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        this.array = new Object[DEFAULT_SIZE];
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

        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        System.out.println(list);

    }


}
