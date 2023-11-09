package creational_patterns.abstractFactory.factories;

import creational_patterns.abstractFactory.chairs.ArtDecoChair;
import creational_patterns.abstractFactory.chairs.Chair;
import creational_patterns.abstractFactory.coffeeTable.ArtDecoCoffeeTable;
import creational_patterns.abstractFactory.coffeeTable.CoffeeTable;
import creational_patterns.abstractFactory.sofas.ArtDecoSofa;
import creational_patterns.abstractFactory.sofas.Sofa;

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
