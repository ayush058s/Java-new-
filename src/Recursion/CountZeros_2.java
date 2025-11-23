package Recursion;

import java.util.Scanner;

public class CountZeros_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int num = countZero(n, 0);
        System.out.println(num);
    }
    public static int countZero(int n, int count){
        if(n == 0){
            return count;
        }
        if (n % 10 == 0) {
            return countZero(n/10, count + 1);
        }
        return countZero(n/10, count);

    }
}
