package filehandling;

import java.io.File;
import java.io.IOException;
public class filehandles {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Java programming\\JLearning\\src\\filehandling\\stu.txt");
		if(!f.exists()) {
			if(f.createNewFile()) {
				System.out.println("File Created");
			}
			else {
				System.out.println("file not created");
			}
			
		}
		else {
			System.out.println("file already created");
			f.delete();
		}
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());

	}

}