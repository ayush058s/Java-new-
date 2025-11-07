package Basics;

public class String01 {
    public static void main(String[] args){
        // string is a class
        String a = "ayush";
        String b = "ayush";
        // string pool => separate memory structure the heap so the similar words are stored in it and will use further
        // STRINGS ARE IMMUTABLE

        System.out.println(a == b);//  == tells that the elements are pointing to same place at heap or not
        // creates separate objects outside the pool
        String outsidePool01 = new String("ram");
        String outsidePool02 = new String("ram");
        System.out.println(outsidePool01 == outsidePool02);// prints false

        System.out.println(outsidePool01.equals(outsidePool02));// it prints true as it just checks the value of string not the memory/place

        System.out.println(a.charAt(0)); // a


        float check = 453.1297f;
        System.out.printf("%.3f", check); //  rounds off and prints till 3 digit

        System.out.printf("\nHello my name is %s and I am %s", "Ayush", "Cool");
    }

}
