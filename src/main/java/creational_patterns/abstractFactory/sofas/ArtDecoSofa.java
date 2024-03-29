package creational_patterns.abstractFactory.sofas;

import creational_patterns.abstractFactory.Color;

public class ArtDecoSofa implements Sofa {
    private final int pillowsAmount = 4;

    @Override
    public int pillowsAmount() {
        return pillowsAmount;
    }

    @Override
    public Color color() {
        return Color.GREEN;
    }

    @Override
    public void print() {
        System.out.println("Created artdeco sofa");
    }
}
