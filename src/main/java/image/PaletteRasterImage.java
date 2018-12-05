package image;

import javafx.scene.paint.Color;

import java.util.List;
import java.util.Vector;

public class PaletteRasterImage extends RasterVector {
    private int[][] indexOfColors;
    private List<Color> palette;

    public PaletteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();
        palette.add(color);
        setPixelsColor(color);
    }

    public PaletteRasterImage(Color[][] pixels) {
        width = pixels.length;
        height = pixels[0].length;
        createRepresentation();
        setPixelsColor(pixels);
    }

    public void createRepresentation() {
        indexOfColors = new int[width][height];
        palette = new Vector<>();
    }

    public void setPixelColor(Color color, int x, int y) {
        if (!palette.contains(color))
            palette.add(color);
        indexOfColors[x][y] = palette.indexOf(color);
    }

    public Color getPixelColor(int x, int y) {
        return palette.get(indexOfColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (!palette.contains(pixels[i][j]))
                    palette.add(pixels[i][j]);
                indexOfColors[i][j] = palette.indexOf(pixels[i][j]);
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