package structural_patterns.facade.menuExample.italy;

public class ItalyCuisineImpl implements ItalyCuisine{
    @Override
    public void classsicLasagne() {
        System.out.println("Classic lasagne");
    }

    @Override
    public void pizzaMargharita() {
        System.out.println("Pizza Margharitta");
    }
}
