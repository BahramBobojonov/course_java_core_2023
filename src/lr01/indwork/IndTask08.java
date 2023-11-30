package lr01.indwork;

import java.util.Scanner;

public class IndTask08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1-ое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите 2-ое число: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Сумма чисел равна = " + sum);
        in.close();
    }
}