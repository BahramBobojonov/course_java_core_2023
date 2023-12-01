package lr02.indwork.IndTask06;

public class TestSquareIndTask06 extends Square{
    public TestSquareIndTask06(double sideLength){
        super(sideLength);
    }
    public static void main(String[] args) {
        Square square = new Square(15);
        System.out.println("Площадь квадрата = " + square.calculateArea());
        System.out.println("Периметр квадрата = " + square.calculatePer());
    }
}