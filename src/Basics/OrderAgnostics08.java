package Basics;

public class OrderAgnostics08 {
    public static void main(String[] args){

      //  int[] arr = {90, 78, 55, 40, 33, 11, 10, 9, 4, 0, -4, -8};
        int[] arr = { -18, -15, -10, -4, 0 , 2, 6, 8, 11, 22};
        int target = -4;
        int ans = OrderAgnosticsBS(arr, target);
        System.out.println(ans);
    }

    static int OrderAgnosticsBS(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        // find whether sorted-array is ascending or descending
        boolean isAsc = arr[start] <= arr[end];



        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(isAsc){
                if(target >= arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid -1;
                }
            }else {
                if(target > arr[mid] ){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
