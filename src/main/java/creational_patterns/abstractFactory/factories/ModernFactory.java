package creational_patterns.abstractFactory.factories;

import creational_patterns.abstractFactory.chairs.Chair;
import creational_patterns.abstractFactory.chairs.ModernChair;
import creational_patterns.abstractFactory.coffeeTable.CoffeeTable;
import creational_patterns.abstractFactory.coffeeTable.ModernCoffeeTable;
import creational_patterns.abstractFactory.sofas.ModernSofa;
import creational_patterns.abstractFactory.sofas.Sofa;

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
