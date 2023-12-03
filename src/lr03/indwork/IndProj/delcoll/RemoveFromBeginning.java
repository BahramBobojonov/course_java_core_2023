package lr03.indwork.IndProj.delcoll;

import java.util.*;

public class RemoveFromBeginning {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время удаления из начала ArrayList: " + removeFromBeginning(arrayList));
        System.out.println("Время удаления из начала LinkedList: " + removeFromBeginning(linkedList));
        System.out.println("Время удаления из начала ArrayDeque: " + removeFromBeginning(new ArrayList<>(arrayDeque)));
    }

    private static long removeFromBeginning(List<Integer> list) {
        // Заполняем коллекцию элементами перед тестированием удаления.
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.remove(0);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}