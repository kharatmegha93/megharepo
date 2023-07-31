package testNg;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoReadExcel {

	public static void main(String[] args) throws IOException {
		String excelfilepath= "E:\\jarfiles\\studentData.xlsx";		//give path excel file
		FileInputStream fis =new FileInputStream(excelfilepath);	//read existing file using inputstrram
		XSSFWorkbook myworkbook=new XSSFWorkbook (fis);				//workbook object
		XSSFSheet mysheet = myworkbook.getSheet("Sheet1");			//myworkbook conttains sheet object 
		int rowcount = mysheet.getLastRowNum();						//return last row number or no. of rows
		for(int i=0;i<rowcount;i++)
		{
			int colcount = mysheet.getRow(i).getLastCellNum();		//return all cells in particular row or no. of column
			
			XSSFRow myrow = mysheet.getRow(i);						//store row object in variable & return 1st row values 
			
			for(int j=0;j<colcount;j++) {
				
				XSSFCell mycell = myrow.getCell(j);					//get cell data or object & stored in variable of XSSFCell
				
			switch(mycell.getCellType())
			{
			case STRING:
				System.out.print("\t"+mycell.getStringCellValue());
				break;
			case BOOLEAN:
				System.out.print("\t"+mycell.getBooleanCellValue());
				break;
			case NUMERIC:
				System.out.print("\t"+mycell.getNumericCellValue());
				break;
			default:
				break;
			}
			System.out.print("  ");
		}
			System.out.println();
		}
		myworkbook.close();
	}
}
		

	


