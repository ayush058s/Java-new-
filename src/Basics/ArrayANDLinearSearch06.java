package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayANDLinearSearch06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> avg = new ArrayList<>();
        for (int i = 0;i < 5;i++)
        {
            avg.add(input.nextInt());
        }

        double sum = 0;
        for (int i = 0;i < avg.size();i++)
        {
            sum = sum + avg.get(i);

        }
        double ans = sum / avg.size();
        System.out.println(ans);
    }
}
