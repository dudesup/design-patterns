package creational_patterns.abstractFactory.chairs;

import creational_patterns.abstractFactory.Color;

public interface Chair {
    int legsAmount();

    Color color();
    void print();
}
