package creational_patterns.abstractFactory.chairs;

import creational_patterns.abstractFactory.Color;

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

    @Override
    public void print() {
        System.out.println("Created modern chair");
    }
}
