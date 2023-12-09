package lr07.indwork;

import java.io.Serializable;
import java.io.*;

class People implements Serializable {
    private final String name;
    private final int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class IndTask04 {
    public static void main(String[] args) throws Exception {
        People obj = new People("Иван", 24);
        // Запись объекта в файл
        FileOutputStream fileOutputStream = new FileOutputStream("src/lr07/test_folder/person.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        objectOutputStream.close();

        // Чтение объекта из файла
        FileInputStream fileInputStream = new FileInputStream("src/lr07/test_folder/person.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        People people = (People) objectInputStream.readObject();
        objectInputStream.close();

        // Вывод значений полей на экран
        people.print();
    }
}