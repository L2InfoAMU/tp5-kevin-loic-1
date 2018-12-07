package image;

import javafx.scene.paint.Color;
import util.*;

public class BruteRasterImage extends RasterVector {
    private Color[][] colors;

    /**
     * constructeur  à partir d'une couleur
     **/
    public BruteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);
    }

    /**
     * Constructeur à partir d'un tableau de couleur
     **/
    public BruteRasterImage(Color[][] colors) {
        this.width = colors.length;
        this.height = colors[0].length;
        createRepresentation();
        this.colors = colors;
        Matrices.requiresNonNull(colors);
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresRectangularMatrix(colors);
    }

    /**
     * initialisation de tableau colors
     **/
    public void createRepresentation() {
        colors = new Color[width][height];
        System.out.println("w = " + width + "h = " + height);
    }

    /**
     * fixe la couleur d'un pixel donné en paramètre
     **/
    public void setPixelColor(Color color, int x, int y) {
        colors[x][y] = color;
    }

    /**
     * recupère la couleur d'un pixel donné en paramètre
     **/
    public Color getPixelColor(int x, int y) {
        return colors[x][y];
    }

    /**
     * fixe la couleur des pixels à partir d'un tableau de couleur donné
     **/
    void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                colors[i][j] = pixels[i][j];
            }
        }
    }

    /**
     * fixe la couleur des pixels avec la couleur donné en paramètre
     **/
    void setPixelsColor(Color color) {
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                setPixelColor(color, i, j);
            }
        }
    }


}