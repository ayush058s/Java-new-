package oops.inheritance;

import oops.inheritance.Box;

public class BoxWeight extends Box {
    int weight;

    BoxWeight(){
        this.weight = 100;
    }

    public BoxWeight(double l, double h, double w, int weight) {
        // always initialized first
        super(l, h, w); // calls the parent class constructor
        // used to initialize parent class constructor

        System.out.println(super.h); // can be also used like this
        this.weight = weight;
    }
}
