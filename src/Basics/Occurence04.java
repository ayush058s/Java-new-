package Basics;

import java.util.Scanner;

public class Occurence04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //  Count of Occurence
        String ch = input.next();
        char a = input.next().charAt(0);

        int sum = 0;
        for(int i = 0; i < ch.length();i++){
            if(ch.charAt(i) == a){
                sum++;
            }
        }
        System.out.println(sum);
        // Reverse a Number
        int reverse = input.nextInt();
        int ans = 0;
        while(reverse > 0){
            int rem = reverse % 10;
            reverse /= 10;
            ans = ans * 10 + rem;

        }
        System.out.println(ans);
    }
}
