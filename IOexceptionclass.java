package Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class IOexceptionclass {

	public static void main(String[] args) {
		try {
			FileReader f =new FileReader("C:\\Users\\DELL\\OneDrive\\Desktop\\Java programming\\JLearning\\src\\Exceptions\\student");
			System.out.println("File Opened");
		} catch(FileNotFoundException e){
			System.out.println("File not Found");
		}
	}

}
