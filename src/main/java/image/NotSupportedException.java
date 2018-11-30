package image;

public class NotSupportedException extends RuntimeException {
    String mes;
    public NotSupportedException(String mes){
        this.mes=mes;
    }
}