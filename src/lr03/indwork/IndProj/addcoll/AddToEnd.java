package lr03.indwork.IndProj.addcoll;

import java.util.*;

public class AddToEnd {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время добавления в конец ArrayList: " + addToEnd(arrayList));
        System.out.println("Время добавления в конец LinkedList: " + addToEnd(linkedList));
        System.out.println("Время добавления в конец ArrayDeque: " + addToEnd(new ArrayList<>(arrayDeque)));
    }

    private static long addToEnd(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}