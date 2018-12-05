package image;

import java.util.List;

import javafx.scene.paint.Color;

public class VectorImage extends RasterVector {
    public List<Shape> shapes;

    public VectorImage(List<Shape> shapes, int width, int height) {
        this.width = width;
        this.height = height;
        this.shapes = shapes;
    }

    public Color getPixelColor(int x, int y) {
        for (Shape shape : shapes)
            if (shape.contains(new Point(x,y)))
                return shape.getColor();
        return Color.WHITE;
    }

}