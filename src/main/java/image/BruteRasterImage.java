package image;
import javafx.scene.paint.Color;
import util.*;


public class BruteRasterImage implements Image{

    private  int width;
    private int height;
    private Color[][] colors;

    public BruteRasterImage(Color color, int width, int height){
       for (int i =0; i<this.width;i++){
           for (int j=0;j<this.height;j++){
               colors[i][j]=color;
           }
        }
        this.width=width;
        this.height=height;
    }

    public BruteRasterImage(Color[][] colors){
        this.colors=colors;
        Matrices.requiresNonNull(colors);
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresRectangularMatrix(colors);
    }

    public void createRepresentation(){
        Color[][] colors = new Color[width][height];
    }

    public void setPixelColor(Color color, int x, int y){
        colors[x][y] = color;
    }

    public Color getPixelColor(int x, int y){
        return colors[x][y];
    }

    private void setPixelsColor(Color[][] pixels){
        for (int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                colors[i][j]=pixels[i][j];
            }
        }
    }

    private void setPixelsColor(Color color){
        for (int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                setPixelColor(color, i, j);
            }
        }
    }

    public int getWidth() {
        return colors[0].length;
    }

    public int getHeight(){
        return colors.length;
    }

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setheight(int height){
        this.height=height;
    }


}
