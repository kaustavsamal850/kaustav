package fetchingdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class FetchingAllData {
	@Test
	public void m() throws IOException
	{
	FileInputStream fis=new FileInputStream("./testdata/DemoData.xlsx");
	Workbook wb=new XSSFWorkbook(fis);
	wb.createSheet("qspider").createRow(3).createCell(4).setCellValue("kaustav");
	FileOutputStream fo=new FileOutputStream("./testdata/DemoData.xlsx");
	wb.write(fo);
	
	}

}
