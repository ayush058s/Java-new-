package Recursion;

import java.util.Arrays;

public class BubbleSort_6 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 9, 3, 7};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int row, int index) {
        if(row == 0){
            return;
        }
        if(index < row) {
            if (arr[index] > arr[index + 1]) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
            bubbleSort(arr, row, index + 1);
        }else{
            bubbleSort(arr, row - 1, 0);
        }
    }
}
