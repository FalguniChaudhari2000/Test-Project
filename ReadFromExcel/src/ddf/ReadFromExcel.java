package ddf;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel{
	public static void main(String[]args) throws IOException
	{
		FileInputStream file= new FileInputStream(new File(System.getProperty("user.dir")+"\\input.xlsx"));
//		class obj = new class(parameters);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
	
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		String fname=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(fname);
		System.out.println("--------------------");
		System.out.println("Pass");
		file.close();
	}
	
	
}