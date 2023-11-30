package lr01.indwork;

import java.util.Scanner;
import java.time.LocalDate;

public class IndTask05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate current_date = LocalDate.now();
        int year = current_date.getYear();
        System.out.println("Введите год рождения: ");
        int biryear = in.nextInt();
        int age = year - biryear;
        System.out.println("Возраст пользователя: " + age);
        in.close();
    }
}