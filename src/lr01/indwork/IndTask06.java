package lr01.indwork;

import java.time.LocalDate;
import java.util.Scanner;

public class IndTask06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        LocalDate current_date = LocalDate.now();
        int year = current_date.getYear();
        System.out.println("Введите год рождения: ");
        int biryear = in.nextInt();
        int age = year - biryear;
        System.out.println("Человек - " + name + ", возраст которого - " + age + " лет");
        in.close();
    }
}