package lr03.indwork.IndProj.addcoll;

import java.util.*;

public class AddToMiddle {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время добавления в середину ArrayList: " + addToMiddle(arrayList));
        System.out.println("Время добавления в середину LinkedList: " + addToMiddle(linkedList));
        System.out.println("Время добавления в середину ArrayDeque: " + addToMiddle(new ArrayList<>(arrayDeque)));
    }

    private static long addToMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(list.size() / 2, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}