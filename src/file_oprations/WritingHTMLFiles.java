package file_oprations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingHTMLFiles {

	public static void main(String a[]) throws IOException {
		
		File f = new File(System.getProperty("user.dir")+"\\src\\config\\myHtml.html");
		
		FileWriter fw = new FileWriter(f, false);
		
		BufferedWriter writer = new BufferedWriter(fw);	
		
		writer.write("<html><body><title>Selenium Auomation</title><h1>Aniket Dilip Yawalkar</h1></body></html>");
		
		writer.close();
		
		System.out.println("File has been created");
			
	}
}
