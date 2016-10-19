package com.company;

/**
 * Created by av128 on 10/19/16.
 */
public class Car{
    public Car(double x){
        cost = x;
    }
    public double getCost() {
        return cost;
    }
    public double getDiscount() {
        cost = cost - (cost * .1);
        return cost;
    }
    public double cost;
}
