import java.util.Scanner;

public class Basic02 {
    public static void main(String[] args) {
        System.out.println("How are you\nEnter a number");
        Scanner takeInput  = new Scanner(System.in);
        double num = takeInput.nextDouble();
        System.out.println("The number is: " + num);

        int a =  23;
        char c = 'A';
        float marks = 23.444f;
        double run = 234.7654321;


    }
}
