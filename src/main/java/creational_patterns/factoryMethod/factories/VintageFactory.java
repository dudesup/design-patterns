package creational_patterns.factoryMethod.factories;

import creational_patterns.factoryMethod.chairs.Chair;
import creational_patterns.factoryMethod.chairs.VintageChair;
import creational_patterns.factoryMethod.coffeeTable.CoffeeTable;
import creational_patterns.factoryMethod.coffeeTable.VintageCoffeeTable;
import creational_patterns.factoryMethod.sofas.Sofa;
import creational_patterns.factoryMethod.sofas.VintageSofa;

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
