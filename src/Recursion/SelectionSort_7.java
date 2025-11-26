package Recursion;

import java.util.Arrays;

public class SelectionSort_7 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 1, 3, 4};
        SS_Recurion(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    private static void SS_Recurion(int[] arr, int row, int index, int max) {
        if(row == 0){
            return;
        }
        if(index < row){
            if(arr[index] > arr[max]){
                SS_Recurion(arr, row, index + 1, index);
            }else {
                SS_Recurion(arr, row, index + 1, max);
            }

        }else{
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            SS_Recurion(arr, row - 1, 0, 0);
        }
    }
}
