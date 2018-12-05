package image;

import javafx.scene.paint.Color;

public abstract class RasterImage implements Image {

    abstract void setPixelsColor(Color color);

    public abstract Color getPixelColor(int x, int y);

    abstract void setPixelsColor(Color[][] pixels);

    public abstract void setPixelColor(Color color, int x, int y);

}