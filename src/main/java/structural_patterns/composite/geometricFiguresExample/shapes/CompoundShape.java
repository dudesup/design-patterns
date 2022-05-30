package structural_patterns.composite.geometricFiguresExample.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape {
    protected List<Shape> childrenShape = new ArrayList<>();

    public CompoundShape(Shape... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    public void add(Shape components) {
        childrenShape.add(components);
    }

    public void add(Shape... components) {
        childrenShape.addAll(Arrays.asList(components));
    }

    public void remove(Shape child) {
        childrenShape.remove(child);
    }

    public void remove(Shape... children) {
        childrenShape.removeAll(Arrays.asList(children));
    }

    public void clear() {
        childrenShape.clear();
    }


}
