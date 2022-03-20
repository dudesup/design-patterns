package structural_patterns.facade.menuExample;


import structural_patterns.facade.menuExample.italy.ItalyCuisine;
import structural_patterns.facade.menuExample.italy.ItalyCuisineImpl;
import structural_patterns.facade.menuExample.polish.PolishCuisine;
import structural_patterns.facade.menuExample.polish.PolishCuisineImpl;
import structural_patterns.facade.menuExample.swiss.SwissCuisine;
import structural_patterns.facade.menuExample.swiss.SwissCuisineImpl;

//facade class
public class Menu {
    private PolishCuisine polishCuisine;
    private SwissCuisine swissCuisine;
    private ItalyCuisine italyCuisine;

    public Menu() {
        polishCuisine = new PolishCuisineImpl();
        swissCuisine = new SwissCuisineImpl();
        italyCuisine = new ItalyCuisineImpl();
    }

    public void dumplingsWithPotatoAndQuark() {
        polishCuisine.dumplingsWithPotatoAndQuark();
    }

    public void dumplingsWithSpinachAndFeta() {
        polishCuisine.dumplingsWithSpinachAndFeta();
    }

    public void fondue() {
        swissCuisine.fondue();
    }

    public void raclette() {
        swissCuisine.raclette();
    }

    public void classsicLasagne() {
        italyCuisine.classsicLasagne();
    }

    public void pizzaMargharita() {
        italyCuisine.pizzaMargharita();
    }

}
