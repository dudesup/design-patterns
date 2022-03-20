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

    public String dumplingsWithPotatoAndQuark() {
        return polishCuisine.dumplingsWithPotatoAndQuark();
    }

    public String dumplingsWithSpinachAndFeta() {
        return polishCuisine.dumplingsWithSpinachAndFeta();
    }

    public String fondue() {
        return swissCuisine.fondue();
    }

    public String raclette() {
        return swissCuisine.raclette();
    }

    public String classsicLasagne() {
        return italyCuisine.classsicLasagne();
    }

    public String pizzaMargharita() {
        return italyCuisine.pizzaMargharita();
    }

}
