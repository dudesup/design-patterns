package creational_patterns.abstractFactory.sofas;

import creational_patterns.abstractFactory.Color;

public class VintageSofa implements Sofa {
    private final int pillowsAmount = 3;

    @Override
    public int pillowsAmount() {
        return pillowsAmount;
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
