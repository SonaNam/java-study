package ch08;

public class Rectangle implements Shape, Drawable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public  double calculateArea(){
        return width * height;
    }

    @Override
    public double calculatePerimeter(){
        return  (width * height);
    }

    @Override
    public void drawLines() {

    }
}
