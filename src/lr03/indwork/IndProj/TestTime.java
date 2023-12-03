package lr03.indwork.IndProj;

import java.util.*;

public class TestTime {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции добавления linkedList = " + getRunningTime(linkedList));
        System.out.println("Время выполнения операции добавления arrayDeque = " + getRunningTime(arrayDeque));
    }

    private static long getRunningTime(Collection<Integer> collection) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            collection.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}