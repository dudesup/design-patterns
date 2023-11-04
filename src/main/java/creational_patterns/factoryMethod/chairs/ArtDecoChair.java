package creational_patterns.factoryMethod.chairs;

import creational_patterns.factoryMethod.Color;

public class ArtDecoChair implements Chair {
    private final int legsNumber = 4;

    @Override
    public int legsAmount() {
        return legsNumber;
    }

    @Override
    public Color color() {
        return Color.GREEN;
    }

    @Override
    public void print() {
        System.out.println("Created artdeco chair");
    }
}
