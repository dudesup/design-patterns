package structural_patterns.facade.menuExample.swiss;

public class SwissCuisineImpl implements SwissCuisine {
    @Override
    public void fondue() {
        System.out.println("Fondue");
    }

    @Override
    public void raclette() {
        System.out.println("Raclette");
    }
}
