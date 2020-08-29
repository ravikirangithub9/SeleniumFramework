package Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {
	static XSSFSheet sheet;
	static XSSFWorkbook workbook;
	
public ExcelTest(String path,String sheetname){
		
	
			XSSFWorkbook workbook;
			try {
				workbook = new XSSFWorkbook(path);
				sheet = workbook.getSheet(sheetname);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
		
			}
  public void getRows() {
	  
 // System.out.println(workbook.getSheet("sheet1").getPhysicalNumberOfRows()); 
 int rowcount=sheet.getPhysicalNumberOfRows();
   System.out.println(rowcount); 
  }
  
  public void getNumericValue(int rno,int cno)  {
	  
		
		// System.out.println(workbook.getSheet("sheet1").getPhysicalNumberOfRows()); 
		  double password= sheet.getRow(rno).getCell(cno).getNumericCellValue();
		 System.out.println(password);
 
}
  public void getStringValue(int rno,int cno)  {
	  
		
		// System.out.println(workbook.getSheet("sheet1").getPhysicalNumberOfRows()); 
		  String username= sheet.getRow(rno).getCell(cno).getStringCellValue();
		 System.out.println(username);

}

}
