package Basics;

public class BinarySearch07 {
    public static void main(String[] args) {
        int[] arr = { -18, -15, -10, -4, 0 , 2, 6, 8, 11, 22};
        int target = -4;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

        // ORDER AGNOSTIC BINARY SEARCH

    }
    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
