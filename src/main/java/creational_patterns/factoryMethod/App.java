package creational_patterns.factoryMethod;

import creational_patterns.factoryMethod.chairs.Chair;
import creational_patterns.factoryMethod.coffeeTable.CoffeeTable;
import creational_patterns.factoryMethod.factories.FurnitureFactory;
import creational_patterns.factoryMethod.sofas.Sofa;

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
