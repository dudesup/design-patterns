package creational_patterns.abstractFactory.chairs;

import creational_patterns.abstractFactory.Color;

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

    @Override
    public void print() {
        System.out.println("Created vintage chair");
    }
}
