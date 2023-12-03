package lr03.indwork.IndProj.delcoll;

import java.util.*;

public class RemoveFromMiddle {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время удаления из середины ArrayList: " + removeFromMiddle(arrayList));
        System.out.println("Время удаления из середины LinkedList: " + removeFromMiddle(linkedList));
        System.out.println("Время удаления из середины ArrayDeque: " + removeFromMiddle(new ArrayList<>(arrayDeque)));
    }

    private static long removeFromMiddle(List<Integer> list) {
        // Заполняем коллекцию элементами перед тестированием удаления.
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.remove(list.size() / 2);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}