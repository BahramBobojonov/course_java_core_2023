package lr02.indwork.IndTask06;

public class TestCircleIndTask06 extends Circle{
    public TestCircleIndTask06(double radius) {
        super(radius);
    }
    public static void main(String[] args) {
        Circle circle = new Circle(11);
        System.out.println("Площадь круга = " + circle.calculateArea());
        System.out.println("Периметр круга = " + circle.calculatePer());
    }
}