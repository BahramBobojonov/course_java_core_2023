package lr02.indwork.IndTask05;

public class IndTask05 {
    private double length; // длина прямоугольника
    private double width; // ширина прямоугольника
    public IndTask05(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    // вычисление площади прямоугольника
    public double calculateArea() {
        return length * width;
    }
    // вычисление периметра прямоугольника
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        IndTask05 rectangle = new IndTask05(5.0, 3.0);
        System.out.println("Длина: " + rectangle.getLength());
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Периметр: " + rectangle.calculatePerimeter());
    }
}