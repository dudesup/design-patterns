package creational_patterns.factoryMethod.coffeeTable;

import creational_patterns.factoryMethod.Color;

public class VintageCoffeeTable implements CoffeeTable {
    private final int legsAmount = 4;

    @Override
    public int legsAmount() {
        return legsAmount;
    }

    @Override
    public Color color() {
        return Color.GOLD;
    }

    @Override
    public void print() {
        System.out.println("Created vintage coffee table");
    }
}
