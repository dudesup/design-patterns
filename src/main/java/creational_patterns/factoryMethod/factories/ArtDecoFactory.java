package creational_patterns.factoryMethod.factories;

import creational_patterns.factoryMethod.chairs.ArtDecoChair;
import creational_patterns.factoryMethod.chairs.Chair;
import creational_patterns.factoryMethod.coffeeTable.ArtDecoCoffeeTable;
import creational_patterns.factoryMethod.coffeeTable.CoffeeTable;
import creational_patterns.factoryMethod.sofas.ArtDecoSofa;
import creational_patterns.factoryMethod.sofas.Sofa;

public class ArtDecoFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
