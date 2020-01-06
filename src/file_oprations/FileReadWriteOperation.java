package file_oprations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteOperation {

	public static void main(String[] a) throws IOException {
		
		File f = new File(System.getProperty("user.dir")+"\\src\\config\\new.csv");
		
		FileWriter fw = new FileWriter(f, true);
		
		BufferedWriter writer = new BufferedWriter(fw);	
		
		String Name="Aniket Yawalkar";
		String Age="25";
		String Nationality="Indian";
		
		writer.write(Name+",");
		writer.newLine();
		writer.write(Age+",");
		writer.newLine();
		writer.write(Nationality+",");
		writer.newLine();
		writer.close();
		
		System.out.println("File has been created");
	}
}
