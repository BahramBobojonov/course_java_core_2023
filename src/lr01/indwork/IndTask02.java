package lr01.indwork;

import java.util.Scanner;

public class IndTask02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        System.out.println("Человек с именем " + name + " имеет возраст - " + age);
        in.close();
    }
}