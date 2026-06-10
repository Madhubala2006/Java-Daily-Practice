package filehandling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReads {

	public static void main(String[] args)throws IOException {
		FileReader fr = new FileReader("C:\\Users\\DELL\\OneDrive\\Desktop\\Java programming\\JLearning\\src\\filehandling\\stu.txt");
		int ch;
		while((ch=fr.read())!=-1) {
			System.out.print((char)ch);
		}

	}

}
