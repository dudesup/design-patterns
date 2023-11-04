package creational_patterns.factoryMethod;

import creational_patterns.factoryMethod.factories.ArtDecoFactory;
import creational_patterns.factoryMethod.factories.FurnitureFactory;
import creational_patterns.factoryMethod.factories.ModernFactory;
import creational_patterns.factoryMethod.factories.VintageFactory;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        App app;
        try {
            app = configureApp();
            app.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static App configureApp() {
        FurnitureFactory factory;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What furniture style do you want?");
        System.out.println("1 - vintage\n2 - artdeco\n3 - modern");
        int style = scanner.nextInt();
        factory = switch (style) {
            case 1 -> new VintageFactory();
            case 2 -> new ArtDecoFactory();
            case 3 -> new ModernFactory();
            default -> throw new IllegalArgumentException("wrong number!");
        };
        return new App(factory);
    }
}
