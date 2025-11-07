package Basics;

import java.util.Arrays;

// for every index:  put that index element at the correct index of LHS
// 5 3 4 1 2 then first it will sort 5 3 and insert 4 in next step at correct index
// 3 4 5 1 2
// 1 3 4 5 2   => 1 2 3 4 5
// stable
// number of swaps are reduced than bubble sort
// used for smaller value and good when array is partially sorted that's why used in hybrid sorting allgoritm

public class InsertionSort11 {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));


    }

    // Insertion Sort function
    static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element (index 1)
        for (int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j > 0; j-- ){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j , j - 1);
                }else{
                    break;
                }
            }
        }
    }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
