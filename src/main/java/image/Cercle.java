package image;
import javafx.scene.paint.Color;
import java.lang.Math;


public class Cercle implements Shape {
    public double r;
    Point centre;
    Color color;

    public Cercle(double r, Point point, Color color){
        this.r=r;
        this.centre=point;
        this.color=color;
    }

    public double Distance (Point centre , Point p){
       return Math.sqrt((p.x - centre.x) * (p.x - centre.x) + (p.y - centre.y) * (p.y - centre.y));
    }

    public boolean contains(Point p){
        return Distance(centre,p)<=r;
    }

    public Color getColor() {
        return color;
    }

}
