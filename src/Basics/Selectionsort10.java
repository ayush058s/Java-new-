package Basics;

import java.util.Arrays;

public class Selectionsort10 {
    public static void main(String[] args){
        int[] arr = {4, -7, 1, 0, 11, 44};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // no stable
    // you have to select a max/min ele and place it accordingly
    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length;i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }

    }
    static int getMaxIndex(int[] arr, int start, int last){
        int max = start;
        for(int i = start + 1; i <= last; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
