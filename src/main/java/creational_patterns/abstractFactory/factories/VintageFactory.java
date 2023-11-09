package creational_patterns.abstractFactory.factories;

import creational_patterns.abstractFactory.chairs.Chair;
import creational_patterns.abstractFactory.chairs.VintageChair;
import creational_patterns.abstractFactory.coffeeTable.CoffeeTable;
import creational_patterns.abstractFactory.coffeeTable.VintageCoffeeTable;
import creational_patterns.abstractFactory.sofas.Sofa;
import creational_patterns.abstractFactory.sofas.VintageSofa;

public class VintageFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public Sofa createSofa() {
        return new VintageSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VintageCoffeeTable();
    }
}
