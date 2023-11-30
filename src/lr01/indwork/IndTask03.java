package lr01.indwork;

import java.util.Scanner;

public class IndTask03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String dayweek = in.nextLine();
        System.out.println("Введите месяц: ");
        String month = in.nextLine();
        System.out.println("Введите число месяца: ");
        int day = in.nextInt();
        System.out.println("Сегодня: " + dayweek + ", " + day + ", " + month);
        in.close();
    }
}