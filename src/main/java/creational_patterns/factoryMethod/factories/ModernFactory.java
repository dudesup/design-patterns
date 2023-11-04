package creational_patterns.factoryMethod.factories;

import creational_patterns.factoryMethod.chairs.Chair;
import creational_patterns.factoryMethod.chairs.ModernChair;
import creational_patterns.factoryMethod.coffeeTable.CoffeeTable;
import creational_patterns.factoryMethod.coffeeTable.ModernCoffeeTable;
import creational_patterns.factoryMethod.sofas.ModernSofa;
import creational_patterns.factoryMethod.sofas.Sofa;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
