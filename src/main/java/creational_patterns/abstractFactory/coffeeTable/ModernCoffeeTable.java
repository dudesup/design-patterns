package creational_patterns.abstractFactory.coffeeTable;

import creational_patterns.abstractFactory.Color;

public class ModernCoffeeTable implements CoffeeTable {
    private final int legsAmount = 4;

    @Override
    public int legsAmount() {
        return legsAmount;
    }

    @Override
    public Color color() {
        return Color.BROWN;
    }

    @Override
    public void print() {
        System.out.println("Created modern coffee table");
    }
}
