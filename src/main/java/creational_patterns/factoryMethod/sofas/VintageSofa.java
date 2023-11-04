package creational_patterns.factoryMethod.sofas;

import creational_patterns.factoryMethod.Color;

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
}
