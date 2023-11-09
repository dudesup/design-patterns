package creational_patterns.abstractFactory.factories;

import creational_patterns.abstractFactory.chairs.Chair;
import creational_patterns.abstractFactory.coffeeTable.CoffeeTable;
import creational_patterns.abstractFactory.sofas.Sofa;

public interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}
