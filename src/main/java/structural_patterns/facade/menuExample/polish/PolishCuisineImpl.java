package structural_patterns.facade.menuExample.polish;

public class PolishCuisineImpl implements PolishCuisine{
    @Override
    public void dumplingsWithPotatoAndQuark() {
        System.out.println("Dumplings with potato and quark");
    }

    @Override
    public void dumplingsWithSpinachAndFeta() {
        System.out.println("Dumplings with spinach and feta");
    }
}
