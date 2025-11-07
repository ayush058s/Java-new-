package Basics;

import java.util.Arrays;

// when given range 1 to N use cyclic sort

public class CyclicSort12 {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 5, 2, 3 };
        cyclicSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));


    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while( i < arr.length){
            int correct = arr[i] -  1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
