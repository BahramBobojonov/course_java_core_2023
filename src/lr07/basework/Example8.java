package lr07.basework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/lr07/test_folder/input.txt"));
        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }
        reader.close();
        System.out.println("Количество строк в файле: " + lineCount);
    }
}