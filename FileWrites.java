package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrites {

    public static void main(String[] args)throws IOException {

        FileWriter write = new FileWriter("C:\\Users\\DELL\\OneDrive\\Desktop\\Java programming\\JLearning\\src\\filehandling\\stu.txt",false);

            write.write("Hello\n");
            write.write("First Java Class\n");
            write.close();

        
    }
}