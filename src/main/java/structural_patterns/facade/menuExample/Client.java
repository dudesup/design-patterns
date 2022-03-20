package structural_patterns.facade.menuExample;

public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu();

        System.out.println("First client");
        menu.dumplingsWithPotatoAndQuark();
        menu.pizzaMargharita();
        menu.raclette();

        System.out.println("Second client");
        menu.dumplingsWithSpinachAndFeta();
        menu.classsicLasagne();
        menu.fondue();
    }
}
