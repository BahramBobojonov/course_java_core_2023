package lr01.indwork;

import java.util.Scanner;

public class IndTask04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца: ");
        String month = in.nextLine();
        System.out.println("Введите количество дней в месяце: ");
        int day = in.nextInt();
        System.out.println("Выбранный месяц - " + month + ", в котором - " + day + " дней");
        in.close();
    }
}