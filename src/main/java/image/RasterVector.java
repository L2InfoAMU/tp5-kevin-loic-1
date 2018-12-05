package image;

import javafx.scene.paint.Color;

public abstract class RasterVector implements Image {
    int width;
    int height;


    @Override
    public abstract Color getPixelColor(int x, int y) ;


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height = height;
    }

}
