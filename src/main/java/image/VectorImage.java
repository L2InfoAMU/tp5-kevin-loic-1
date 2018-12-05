package image;

import java.util.List;
import java.util.Vector;
import javafx.scene.paint.Color;

public class VectorImage implements Image {
    private int width;
    private int height;
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

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    protected int setWidth(int width) {
        return this.width = width;
    }

    protected int setHeight(int height) {
        return this.height = height;
    }
}