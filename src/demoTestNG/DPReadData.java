package demoTestNG;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DPReadData {
	@DataProvider
	public static String[][] read() throws Exception
	{
		String st[][];
		String path="E:\\\\Book1.xlsx";
	 FileInputStream fis=new FileInputStream(path);//------------->mentioning the path of file
   	 Workbook wb=WorkbookFactory.create(fis);//------------------------------->to load the excel file
   	 Sheet sh=wb.getSheet("Sheet1");//---------------------------------------->loading the sheet of excel
   	 int rowcount=sh.getPhysicalNumberOfRows();//----------------------------->get the row count
   	 int colcount=sh.getRow(0).getLastCellNum();
   	 st=new String[rowcount-1][colcount];
   	 for(int i=1;i<rowcount;i++)
   	 {
   		 for(int j=0;j<colcount;j++)
   		 {
   			 Cell cl=sh.getRow(i).getCell(j);
   			 st[i-1][j]=cl.toString();
   		 }
   	 }
   	 return st;
	}

}


