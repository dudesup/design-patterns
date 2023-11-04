package creational_patterns.factoryMethod.sofas;

import creational_patterns.factoryMethod.Color;

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
}
