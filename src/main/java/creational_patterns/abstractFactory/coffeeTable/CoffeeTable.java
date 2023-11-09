package creational_patterns.abstractFactory.coffeeTable;

import creational_patterns.abstractFactory.Color;

public interface CoffeeTable {
    int legsAmount();
    Color color();
    void print();
}
