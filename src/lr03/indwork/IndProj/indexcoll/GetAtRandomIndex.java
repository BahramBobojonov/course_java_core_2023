package lr03.indwork.IndProj.indexcoll;

import java.util.*;

public class GetAtRandomIndex {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время получения по случайному индексу из ArrayList: " + getAtRandomIndex(arrayList));
        System.out.println("Время получения по случайному индексу из LinkedList: " + getAtRandomIndex(linkedList));
        System.out.println("Время получения по случайному индексу из ArrayDeque: " + getAtRandomIndex(new ArrayList<>(arrayDeque)));
    }

    private static long getAtRandomIndex(List<Integer> list) {
        // Заполняем коллекцию элементами перед тестированием получения по индексу.
        for (int i = 0; i < 1000000000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = random.nextInt(list.size());
            int element = list.get(randomIndex);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}