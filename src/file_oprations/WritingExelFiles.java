package file_oprations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExelFiles {

	public static void main(String a[]) throws IOException {
		
		XSSFWorkbook workBook = new XSSFWorkbook();
		
		XSSFSheet sheet = workBook.createSheet("firstSheet");
		
		Row row0 = sheet.createRow(0);
		
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		
		cellA.setCellValue("dfks");
		cellB.setCellValue("slkdlskdjfkls");
		
		File file = new File(System.getProperty("user.dir")+"\\src\\config\\myExelFile1.xlsx");
		
		FileOutputStream fo = new FileOutputStream(file);
		
		workBook.write(fo);
		
		fo.close();
		
		System.out.println("File Created");
	}
}
