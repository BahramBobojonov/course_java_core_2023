package lr05.indwork;

import java.util.Random;

class SummationThread extends Thread {
    private int[] array;
    private int startIndex;
    private int endIndex;
    private long partialSum;

    public SummationThread(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.partialSum = 0;
    }

    public long getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        for (int i = startIndex; i <= endIndex; i++) {
            partialSum += array[i];
        }
    }
}

public class IndTask03 {
    public static long sumArray(int[] array) throws InterruptedException {
        int numThreads = Runtime.getRuntime().availableProcessors();
        SummationThread[] threads = new SummationThread[numThreads];

        // Разделение массива на подмассивы для каждого потока
        int chunkSize = array.length / numThreads;

        // Создание и запуск потоков
        for (int i = 0; i < numThreads; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == numThreads - 1) ? array.length - 1 : (i + 1) * chunkSize - 1;
            threads[i] = new SummationThread(array, startIndex, endIndex);
            threads[i].start();
        }

        // Ожидание завершения выполнения всех потоков
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        // Суммирование результатов каждого потока
        long totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            totalSum += threads[i].getPartialSum();
        }

        return totalSum;
    }

    public static void main(String[] args) throws InterruptedException {
        // Пример использования
        int[] array = new int[1000000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        long sum = sumArray(array);
        System.out.println("Сумма элементов массива: " + sum);
    }
}