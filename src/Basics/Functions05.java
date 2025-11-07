package Basics;

import java.util.Scanner;

class Functions05{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String ch = input.next();

        int  a = ch.length();
        String re = "";

        for(int i = a - 1;i >= 0;i--){
            re = re + ch.charAt(i);

        }
        if(ch.equals(re)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}