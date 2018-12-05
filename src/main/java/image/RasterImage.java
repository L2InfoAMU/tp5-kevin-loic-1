package image;

import javafx.scene.paint.Color;

public abstract class RasterImage implements Image {
    int width;
    int height;


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

    abstract void setPixelsColor(Color color);

    public abstract Color getPixelColor(int x, int y);

    abstract void setPixelsColor(Color[][] pixels);

    public abstract void setPixelColor(Color color, int x, int y);


}