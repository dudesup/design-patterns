package structural_patterns.facade.menuExample.swiss;

public class SwissCuisineImpl implements SwissCuisine {
    @Override
    public String fondue() {
        return "Fondue";
    }

    @Override
    public String raclette() {
        return "Raclette";
    }
}
