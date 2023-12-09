package lr06.indwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IndTask03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Солнце");
        list.add("Луна");
        list.add("Музыка");
        list.add("Автобус");
        list.add("Трамвай");
        list.add("Троллейбус");
        System.out.println(list);
        Random random = new Random();
        int length = random.nextInt(10);
        System.out.println("Ограничение по длине: " + length);

        List<String> filteredList = filterByLength(list, length);
        System.out.println("Соответствуют ограничению: " + filteredList);
    }
    public static List<String> filterByLength(List<String> list, int length) {
        return list.stream().filter(s -> s.length() > length).collect(Collectors.toList());
    }
}