package fetchingdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ReadData {
@Test
public void readDataFromExcel() throws IOException
{
	FileInputStream fis=new FileInputStream("./testdata/DemoData.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	Sheet sheet=wb.getSheet("demodata");
	     Row row =sheet.getRow(0);
	        Cell cell=row.getCell(0);
	        System.out.println(cell.getStringCellValue());
	     
	
	
	
}
}
