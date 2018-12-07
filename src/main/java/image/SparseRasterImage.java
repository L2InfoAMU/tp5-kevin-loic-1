package image;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterVector {
    private Point point;
    public Map<Point, Color> map;

    /**
     * Constructeur de SparseRasterImage à partir d'une couleur
     **/
    public SparseRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);
    }

    /**
     * Constructeur à partir d'un tableau de couleurs
     **/
    public SparseRasterImage(Color[][] pixels) {
        width = pixels.length;
        height = pixels[0].length;
        createRepresentation();
        setPixelsColor(pixels);
    }

    /**
     * initialiasation de la map
     **/
    public void createRepresentation() {
        map = new HashMap<>();
    }

    /**
     * fixe la couleur d'un pixel donné en paramàtre
     **/
    public void setPixelColor(Color color, int x, int y) {
        point = new Point(x, y);
        if (!map.containsKey(point))
            map.put(point, color);
    }

    /**
     * On récupère la couleur d'un pixel
     **/
    public Color getPixelColor(int x, int y) {
        point = new Point(x, y);
        return map.get(point);
    }

    /**
     * Fixe la couleur des pixels à partir d'un tableau de couleur donné
     **/
    void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                point = new Point(i, j);
                map.put(point, pixels[i][j]);

            }
        }
    }

    /**
     * Fixe la couleur des pixels avec la couleur donnée
     **/
    void setPixelsColor(Color color) {
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                setPixelColor(color, i, j);
            }
        }
    }


}