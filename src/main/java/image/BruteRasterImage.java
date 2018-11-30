package image;
import javafx.scene.paint.Color;
import util.*;


public class BruteRasterImage implements Image{
    private  int width;
    private int height;
    private Color[][] colors;

    public BruteRasterImage(Color color, int width, int height){
        createRepresentation();
        this.width=width;
        this.height=height;
        for (int i =0; i<width;i++){
            for (int j=0;j<height;j++){
                colors[i][j]=color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors){
        //this.width=colors.length;
        //this.height=colors[0].length;
        createRepresentation();
        this.colors=colors;
        Matrices.requiresNonNull(colors);
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresRectangularMatrix(colors);
    }

    public void createRepresentation(){
        width=colors.length;
        height=colors[0].length;
        colors = new Color[width][height];
        System.out.println("w = " + width + "h = " + height);
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
        return width;
    }

    public int getHeight(){
        return height;
    }

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }


}