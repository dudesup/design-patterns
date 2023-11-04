package creational_patterns.factoryMethod.coffeeTable;

import creational_patterns.factoryMethod.Color;

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
