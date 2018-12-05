package image;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage {
    private Point point;
    public Map<Point, Color> map;

    public SparseRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);
    }

    public SparseRasterImage(Color[][] pixels) {
        width = pixels.length;
        height = pixels[0].length;
        createRepresentation();
        setPixelsColor(pixels);
    }

    public void createRepresentation() {
        map = new HashMap<>();
    }

    public void setPixelColor(Color color, int x, int y) {
        point = new Point(x, y);
        if (!map.containsKey(point))
            map.put(point, color);
    }

    public Color getPixelColor(int x, int y) {
        point = new Point(x, y);
        return map.get(point);
    }


    void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                point = new Point(i, j);
                map.put(point, pixels[i][j]);

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