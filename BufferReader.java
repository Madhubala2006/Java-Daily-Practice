package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(
                new FileReader("C:\\Users\\DELL\\OneDrive\\Desktop\\Java programming\\JLearning\\src\\filehandling\\stu.txt"));

        String line;

        while ((line = bf.readLine()) != null) {

            String[] word = line.split(" ");

            for (String words : word) {
                System.out.println(words);
            }
        }

        bf.close();
    }
}