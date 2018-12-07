package image;

import javafx.scene.paint.Color;

public class Rectangle implements Shape {
    public Point p;
    public int width, height;
    private Color color;

    /**
     * Construction d'un rectangle avec un point représentant le coin gauche supérieur
     * sa longueur
     * sa hauteur
     **/
    public Rectangle(int x, int y, int width, int height, Color color) {
        p = new Point(x, y);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /**
     * retourne vrai si le point passé en paramètre se trouve dans le rectangle
     **/
    public boolean contains(Point point) {
        return (p.x <= point.x &&
                point.x <= (p.x) + width &&
                p.y <= point.y &&
                point.y <= (p.y) + height);
    }

    /**
     * Récupère la couleur
     **/
    public Color getColor() {
        return color;
    }
}