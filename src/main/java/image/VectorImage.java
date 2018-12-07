package image;

import java.util.List;

import javafx.scene.paint.Color;

public class VectorImage extends RasterVector {
    public List<Shape> shapes;

    /***construction d'un vectorImage qui avec une liste de Shape
     * longueur de l'image
     * largeur de l'image*/
    public VectorImage(List<Shape> shapes, int width, int height) {
        this.width = width;
        this.height = height;
        this.shapes = shapes;
    }

    /**
     * récupère la couleur d'un pixel dans la liste de Shape
     **/
    public Color getPixelColor(int x, int y) {
        for (Shape shape : shapes)
            if (shape.contains(new Point(x, y)))
                return shape.getColor();
        return Color.WHITE;
    }

}