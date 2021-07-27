import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    
     
    	 FileInputStream fis=new FileInputStream("E:\\Book1.xlsx");//------------->mentioning the path of file
    	 Workbook wb=WorkbookFactory.create(fis);//------------------------------->to load the excel file
    	 Sheet sh=wb.getSheet("Sheet1");//---------------------------------------->loading the sheet of excel
    	 int rowcount=sh.getPhysicalNumberOfRows();//----------------------------->get the row count
    	 int colcount=sh.getRow(0).getLastCellNum();//---------------------------->get the column(cel) count of the 0th row
    	 
    	 for(int i=0;i<rowcount;i++)
    	 {
    		 for(int j=0;j<colcount;j++)
    		 {
    			 Cell cl=sh.getRow(i).getCell(j);
    			 System.out.println(cl);
    		 }
    	 }
    	 
     }
	}


