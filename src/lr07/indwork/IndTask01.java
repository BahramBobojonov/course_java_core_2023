package lr07.indwork;

import java.io.*;
import java.util.Scanner;

public class IndTask01 {
    public static void main(String[] args) throws IOException {
        // считываем название файла
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь к файлу: ");
        String fileName = in.nextLine();
        // создаем переменую и подгружаем в нее файл, затем смотрим его размер
        File file = new File(fileName);
        long fileSizeInBytes = file.length();
        System.out.println("Размер файла равен: " + fileSizeInBytes + " байт");
    }
}