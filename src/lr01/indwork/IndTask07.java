package lr01.indwork;

import java.time.LocalDate;
import java.util.Scanner;

public class IndTask07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate current_date = LocalDate.now();
        int year = current_date.getYear();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        int byear = year - age;
        System.out.println("Ваш год рождения: " + byear);
        in.close();
    }
}