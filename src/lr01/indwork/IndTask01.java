package lr01.indwork;

import java.util.Scanner;

public class IndTask01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию: ");
        String name = in.nextLine();
        System.out.println("Введите Имя: ");
        String name2 = in.nextLine();
        System.out.println("Введите Отчество: ");
        String name3 = in.nextLine();
        System.out.println("Привет, " + name + " " + name2 + " " + name3);
        in.close();
    }
}