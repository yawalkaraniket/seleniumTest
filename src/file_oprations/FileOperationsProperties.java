package file_oprations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileOperationsProperties {

	public static void main(String a[]) throws IOException {
	// Reading properties
	Properties props = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\test.properties");
	props.load(fis);
	
	System.out.println(props.get("Name"));
	System.out.println(props.get("Age"));
	System.out.println(props.get("Nationality"));
	System.out.println(System.getProperty("user.dir"));
	}
}
