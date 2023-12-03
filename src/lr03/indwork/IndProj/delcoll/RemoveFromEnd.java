package lr03.indwork.IndProj.delcoll;

import java.util.*;

public class RemoveFromEnd {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время удаления из конца ArrayList: " + removeFromEnd(arrayList));
        System.out.println("Время удаления из конца LinkedList: " + removeFromEnd(linkedList));
        System.out.println("Время удаления из конца ArrayDeque: " + removeFromEnd(new ArrayList<>(arrayDeque)));
    }

    private static long removeFromEnd(List<Integer> list) {
        // Заполняем коллекцию элементами перед тестированием удаления.
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.remove(list.size() - 1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}