package image;

import javafx.scene.paint.Color;

public class Rectangle implements Shape {
    public Point p;
    public int width,height;
    private Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        p = new Point(x, y);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public boolean contains(Point point) {
        return (p.x<=point.x &&
                point.x   <=(p.x)+width &&
                p.y<=point.y &&
                point.y  <=(p.y)+height);
    }

    public Color getColor() {
        return color;
    }
}