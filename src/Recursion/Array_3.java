package Recursion;

import java.util.Arrays;

public class    Array_3 {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sorted(arr, 0));

    }

    public static boolean sorted(int[] arr, int i){
        if(i == arr.length - 1){
            return true;
        }

        return arr[i] < arr [ i + 1] && sorted(arr, i + 1);
    }
}
