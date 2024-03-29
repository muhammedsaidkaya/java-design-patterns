package Structural.DecoratorPattern.BeverageTypes;

import Structural.DecoratorPattern.Beverage;

public class Decaf extends Beverage {

    @Override
    public double cost() {
        return 2;
    }

    @Override
    public String desc() {
        return "Decaf";
    }
}
