package lr02.indwork.IndTask06;

// Класс квадрата
public class Square implements IndTask06 {
    private double sideLength;
    // Конструктор, позволяющий создавать объекты класса Square
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    // Переопределение метода расчёта площади
    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 2);
    }

    // Переопределение метода расчёта перриметра
    @Override
    public double calculatePer() {
        return 4 * sideLength;
    }
}