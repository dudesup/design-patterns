package creational_patterns.factoryMethod.chairs;

import creational_patterns.factoryMethod.Color;

public class VintageChair implements Chair {
    private final int legsAmount = 4;

    @Override
    public int legsAmount() {
        return legsAmount;
    }

    @Override
    public Color color() {
        return Color.GOLD;
    }
}
