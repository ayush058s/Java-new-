package Recursion;

public class RotatedBinarySearch_4 {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 1, 2, 3, 4, 5};
        int target = 8;
        int ans = searchInBS(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    private static int searchInBS(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return searchInBS(arr, target, start, mid - 1);
            } else {
                return searchInBS(arr, target, mid + 1, end);
            }
        }

        if (target >= arr[mid] && target <= arr[end]) {
            return searchInBS(arr, target, mid + 1, end);
        }

        return searchInBS(arr, target, start, mid - 1);
    }
}
