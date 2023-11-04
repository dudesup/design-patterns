package creational_patterns.factoryMethod.sofas;

import creational_patterns.factoryMethod.Color;

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
