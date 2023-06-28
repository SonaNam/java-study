package ch08;

public class Square implements Shape {
    private double side;        // 변의값

    public Square(Double side){
        this.side = side;
    }

@Override
public double calculateArea(){
    return side * side;
}
@Override
public double calculatePerimeter(){
    return 4 * side;


}

}