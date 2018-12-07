package image;

import javafx.scene.paint.Color;

import java.util.List;
import java.util.Vector;

public class PaletteRasterImage extends RasterVector {
    private int[][] indexOfColors;
    private List<Color> palette;

    /**
     * constructeur  à partir d'une couleur
     **/
    public PaletteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();
        palette.add(color);
        setPixelsColor(color);
    }

    /**
     * Constructeur à partir d'un tableau de couleur
     **/
    public PaletteRasterImage(Color[][] pixels) {
        width = pixels.length;
        height = pixels[0].length;
        createRepresentation();
        setPixelsColor(pixels);
    }

    /**
     * initialisation de tableau d'index colors
     **/
    public void createRepresentation() {
        indexOfColors = new int[width][height];
        palette = new Vector<>();
    }

    /**
     * fixe la couleur d'un pixel donné en paramètre
     **/
    public void setPixelColor(Color color, int x, int y) {
        if (!palette.contains(color))
            palette.add(color);
        indexOfColors[x][y] = palette.indexOf(color);
    }

    /**
     * recupère la couleur d'un pixel donné en paramètre
     **/
    public Color getPixelColor(int x, int y) {
        return palette.get(indexOfColors[x][y]);
    }


    /**
     * fixe la couleur des pixels à partir d'un tableau de couleur donné
     **/
    public void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                if (!palette.contains(pixels[i][j]))
                    palette.add(pixels[i][j]);
                indexOfColors[i][j] = palette.indexOf(pixels[i][j]);
            }
        }
    }


    /**
     * fixe la couleur des pixels avec la couleur donnée en paramètre
     **/
    void setPixelsColor(Color color) {
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                setPixelColor(color, i, j);
            }
        }
    }


}