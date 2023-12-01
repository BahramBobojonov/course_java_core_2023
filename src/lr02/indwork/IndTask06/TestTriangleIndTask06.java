package lr02.indwork.IndTask06;

public class TestTriangleIndTask06 extends Triangle{
    public TestTriangleIndTask06(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(9, 8, 7);
        System.out.println("Площадь треугольника = " + triangle.calculateArea());
        System.out.println("Периметр треугольника = " + triangle.calculatePer());
    }
}