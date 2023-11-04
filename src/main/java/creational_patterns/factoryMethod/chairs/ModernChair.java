package creational_patterns.factoryMethod.chairs;

import creational_patterns.factoryMethod.Color;

public class ModernChair implements Chair {
    private final int legsAmount = 3;

    @Override
    public int legsAmount() {
        return legsAmount;
    }

    @Override
    public Color color() {
        return Color.RED;
    }
}
