package structural_patterns.facade.menuExample.italy;

public class ItalyCuisineImpl implements ItalyCuisine{
    @Override
    public String classsicLasagne() {
        return "Classic lasagne";
    }

    @Override
    public String pizzaMargharita() {
        return "Pizza Margharitta";
    }
}
