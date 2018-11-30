package image;
import javafx.scene.paint.Color;
import java.util.List;
import java.util.Vector;

public class PaletteRasterImage implements Image{
    private int [][] indexOfColors;
    private int width;
    private int height;
    private List<Color> palette;

    public PaletteRasterImage(Color color, int width, int height){
        //palette.add(color);
        indexOfColors = new int[width][height];
        this.width=indexOfColors.length;
        this.height=indexOfColors[0].length;
        //createRepresentation();
        for (int i=0; i<width; i++){
            for (int j=0; j<height;j++){
                indexOfColors[i][j]=palette.indexOf(color);
            }
        }
    }

    public PaletteRasterImage(Color[][] pixels){
        width=pixels.length;
        height=pixels[0].length;
        palette = new Vector<>();
        for (int i=0; i<width; i++){
            for (int j=0; j<height; j++){
                indexOfColors[i][j]=palette.indexOf(pixels[i][j]);
            }
        }
    }

    public void createRepresentation(){
        indexOfColors = new int[width][height];
        palette = new Vector <>();
        }

    public void setPixelColor(Color color, int x, int y){
        indexOfColors[x][y]=palette.indexOf(color);
        if(!palette.contains(color)){
            palette.add(color);
        }
    }

    public Color getPixelColor(int x, int y){
        return palette.get(indexOfColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels){
        for (int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                indexOfColors[i][j]=palette.indexOf(pixels[i][j]);
            }
        }
    }


    private void setPixelsColor(Color color){
        for (int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                indexOfColors[i][j]=palette.indexOf(color);
            }
        }
    }

    public int getWidth(){
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