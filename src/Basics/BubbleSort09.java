package Basics;

import java.util.Arrays;

//it is a stable sorting algorithm that means on sorting order should be same when value is same
// bubble sort OR sinking sort OR exchange sort
// compares with an adjacent ele, and in each step it places the largest ele at rightmost


public class BubbleSort09 {
    public static void main(String[] args)
    {
        int[] arr = {-1, 3, 8, 7, -8, 10};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
