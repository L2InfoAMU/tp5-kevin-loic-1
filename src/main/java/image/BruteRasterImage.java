package image;

import javafx.scene.paint.Color;
import util.*;
//implements Image

public class BruteRasterImage extends RasterVector {
    private Color[][] colors;

    public BruteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] colors) {
        this.width = colors.length;
        this.height = colors[0].length;
        createRepresentation();
        this.colors = colors;
        Matrices.requiresNonNull(colors);
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresRectangularMatrix(colors);
    }

    public void createRepresentation() {
        colors = new Color[width][height];
        System.out.println("w = " + width + "h = " + height);
    }

    public void setPixelColor(Color color, int x, int y) {
        colors[x][y] = color;
    }

    public Color getPixelColor(int x, int y) {
        return colors[x][y];
    }

    void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                colors[i][j] = pixels[i][j];
            }
        }
    }

    void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                setPixelColor(color, i, j);
            }
        }
    }


}