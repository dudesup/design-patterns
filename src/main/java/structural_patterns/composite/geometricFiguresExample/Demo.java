package structural_patterns.composite.geometricFiguresExample;

import structural_patterns.composite.geometricFiguresExample.editor.ImageEditor;
import structural_patterns.composite.geometricFiguresExample.shapes.Circle;
import structural_patterns.composite.geometricFiguresExample.shapes.CompoundShape;
import structural_patterns.composite.geometricFiguresExample.shapes.Dot;
import structural_patterns.composite.geometricFiguresExample.shapes.Rectangle;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        editor.loadShapes(
                new Circle(10, 10, Color.RED, 10),
                new CompoundShape(
                        new Rectangle(200, 200, 100, 100, Color.BLACK),
                        new Dot(240, 240, Color.BLUE)
                )
        );
    }
}
