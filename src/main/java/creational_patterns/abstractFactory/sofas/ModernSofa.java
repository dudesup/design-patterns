package creational_patterns.abstractFactory.sofas;

import creational_patterns.abstractFactory.Color;

public class ModernSofa implements Sofa {
    private final int pillowsAmount = 4;

    @Override
    public int pillowsAmount() {
        return pillowsAmount;
    }

    @Override
    public Color color() {
        return Color.RED;
    }

    @Override
    public void print() {
        System.out.println("Created modern coffee table");
    }
}
