package lr07.basework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example9 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/lr07/test_folder/input.txt");
        FileWriter writer = new FileWriter("src/lr07/test_folder/output.txt");
        int c;
        while ((c = reader.read()) !=-1){
            writer.write(c);
        }
        reader.close();
        writer.close();
        System.out.println("Файл скопирован успешно!");
    }
}