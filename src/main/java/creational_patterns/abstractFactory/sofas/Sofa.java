package creational_patterns.abstractFactory.sofas;

import creational_patterns.abstractFactory.Color;

public interface Sofa {
    int pillowsAmount();

    Color color();

    void print();
}
