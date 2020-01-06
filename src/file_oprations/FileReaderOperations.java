package file_oprations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderOperations {

	public static void main(String a[]) throws IOException{
		
		 File file = new File(System.getProperty("user.dir")+"\\src\\config\\myFileReader.txt");
		
		FileReader fileReader = new FileReader(file);
		
		BufferedReader reader = new BufferedReader(fileReader);
		String readerLine = null;
		while((readerLine = reader.readLine())!=null) {
		System.out.println(readerLine);
		}
		
		reader.close();
	}
}
