package creational_patterns.abstractFactory;

import creational_patterns.abstractFactory.chairs.Chair;
import creational_patterns.abstractFactory.coffeeTable.CoffeeTable;
import creational_patterns.abstractFactory.factories.FurnitureFactory;
import creational_patterns.abstractFactory.sofas.Sofa;

public class App {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public App(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }

    public void print() {
        chair.print();
        sofa.print();
        coffeeTable.print();
    }
}
