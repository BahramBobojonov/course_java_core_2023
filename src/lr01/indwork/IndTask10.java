package lr01.indwork;

import java.util.Scanner;

public class IndTask10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1-е число: ");
        int num1 = in.nextInt();
        System.out.println("Введите 2-е число: ");
        int num2 = in.nextInt();
        int plus = num1 + num2;
        int minus = num1 - num2;
        System.out.println("Сумма чисел: " + plus);
        System.out.println("Разность чисел: " + minus);
        in.close();
    }
}