package lr06.indwork;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class IndTask05 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Владимир 23", "Олег и Анна", "Марс 2026", "Java Core", "Spring", "Строка");
        System.out.println("Исходный массив: " + list);

        List<String> filteredList = filterBySymbol(list);
        System.out.println("Слова без цифр и символов: " + filteredList);
    }

    public static List<String> filterBySymbol(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-Я\\s]+"))
                .collect(Collectors.toList());
    }
}