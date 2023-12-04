package lr04.indwork;

import java.util.Scanner;

public class IndTask03 {
    public static void main(String[] args) {

        byte testArray[] = new byte[4];

        System.out.println("Вводите номера столбцов для вывода элементов: ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.printf("Введите byte-число номер %s из 4\n", i+1);
            try {
                byte num = Byte.parseByte(scanner.nextLine());
                testArray[i] = num;
            } catch (NumberFormatException n) {
                System.out.println("Тип не соответствует!");
                i--;
            }

        }

        int res = 0;

        for (int i = 0; i < testArray.length; i++) {
            res += testArray[i];
        }

        System.out.printf("Сумма - %s", res);

    }
}