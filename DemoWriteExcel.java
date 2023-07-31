package testNg;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoWriteExcel {


	public static void main(String[] args) throws IOException {
		XSSFWorkbook mywrk =new XSSFWorkbook();								//create empty workbook
		XSSFSheet newSheet= mywrk.createSheet("Student_info");
		Object studentdata[][]= {{"student name","Registraton number"},			//object can store heterogenous data & 2d use for rows ,column--1st row
				{"nehal",1234},												//2nd row
				{"swati",1456},												//3rd row
				{"megha",5647}};											//4th row
		int rcount =studentdata.length;										//get no.of rows
		int ccount = studentdata[0].length;									//get no. of columns--[0] use for any row to give total cells
		
		//create rows and columns
		for(int i=0;i<rcount;i++)						//0th row
		{
			XSSFRow newrow = newSheet.createRow(i);				//create 1 row
			for(int j=0;j<ccount;j++)							//get all cells or columns
			{
				XSSFCell newcell = newrow.createCell(j);	// 0th column----create cell in row
				Object cellValue =studentdata[i][j];			//read or update data in cells from object in excel file
				
				if(cellValue instanceof String)					//check cellvalue and typecast in string & set in newcell
					newcell.setCellValue((String)cellValue);
					
				if(cellValue instanceof Boolean)
					newcell.setCellValue((boolean)cellValue);
					
				if(cellValue instanceof Integer)
					newcell.setCellValue((Integer)cellValue);			
				
			}
		}
		/// we created data and send to sheet
		
		String excelpath = "E:\\jarfiles\\studentInformation.xlsx";		//create filepath
		FileOutputStream fos = new FileOutputStream(excelpath);			// open the file in outputsteam mode so can write workbook
		mywrk.write(fos);											//write workbook in file
		System.out.println("The file is created");
		mywrk.close();
		fos.close();
		
	}

}
