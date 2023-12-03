package lr03.indwork.IndProj.addcoll;

import java.util.*;

public class AddToBeginning {
    public static void main(String[] args) {
        // Создаем экземпляры трех коллекций: ArrayList, LinkedList и ArrayDeque.
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        // Измеряем время выполнения операции добавления в начало для ArrayList.
        System.out.println("Время добавления в начало ArrayList: " + addToBeginning(arrayList));
        // Измеряем время выполнения операции добавления в начало для LinkedList.
        System.out.println("Время добавления в начало LinkedList: " + addToBeginning(linkedList));
        // Измеряем время выполнения операции добавления в начало для ArrayDeque.
        System.out.println("Время добавления в начало ArrayDeque: " + addToBeginning(new ArrayList<>(arrayDeque)));
    }

    // Метод для измерения времени выполнения операции добавления в начало коллекции.
    private static long addToBeginning(List<Integer> list) {
        // Фиксируем начальное время выполнения операции.
        long start = System.currentTimeMillis();
        // Добавляем элементы в начало коллекции.
        for (int i = 0; i < 1000000; i++) {
            list.add(0, i);
        }
        // Фиксируем конечное время выполнения операции.
        long end = System.currentTimeMillis();
        // Возвращаем затраченное время.
        return end - start;
    }
}