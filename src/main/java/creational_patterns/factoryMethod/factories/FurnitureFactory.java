package creational_patterns.factoryMethod.factories;

import creational_patterns.factoryMethod.chairs.Chair;
import creational_patterns.factoryMethod.coffeeTable.CoffeeTable;
import creational_patterns.factoryMethod.sofas.Sofa;

public interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}
