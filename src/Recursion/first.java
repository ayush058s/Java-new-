package Recursion;

public class first {
    public static void main(String[] args) {
        printTill1(5);
        printTillN(5);
        int fact = factorial(3);
        System.out.println("fact = " + fact);

        int sum = SumOfDigits(23);
        System.out.println(sum);

        reverse(1234567);
    }

    private static void printTill1(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printTill1(n-1);

    }

    private static void printTillN(int n){
        if(n == 1){
            System.out.print(1);
            return;
        }
        printTillN(n-1);
        System.out.print(n);
    }

    private static int factorial(int n){

        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static int SumOfDigits(int n){
        if(n == 0){
            return 0;
        }

        return (n % 10) + SumOfDigits(n / 10);
    }

    private static void reverse(int n){
        if(n % 10 == n){
            System.out.println(n);
            return;
        }

        int rem = n % 10;
        System.out.println(rem);
        reverse(n / 10);
    }

}
