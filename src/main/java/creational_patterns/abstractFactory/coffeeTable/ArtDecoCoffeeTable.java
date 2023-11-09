package creational_patterns.abstractFactory.coffeeTable;

import creational_patterns.abstractFactory.Color;

public class ArtDecoCoffeeTable implements CoffeeTable {
    private final int legsNumber = 4;

    @Override
    public int legsAmount() {
        return legsNumber;
    }

    @Override
    public Color color() {
        return Color.RED;
    }

    @Override
    public void print() {
        System.out.println("Created artdeco coffee table");
    }
}
