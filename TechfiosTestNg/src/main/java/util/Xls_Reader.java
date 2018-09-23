package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	
public  String path; // is to declare the excel path
public  FileInputStream fis=null; //read a file

private XSSFWorkbook workbook=null; //connects with the excel
private XSSFSheet sheet=null; //connect with the excel sheet
private XSSFRow row=null; // connecting with the row
private XSSFCell cell=null;// connecting with the cell (column)

public Xls_Reader(String path) {
	
	this.path=path;
	try {
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		fis.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}	
	
public String getCellData(String sheetName,String colName,int rowNum){
	try{
		
	//for sheet
	int index = workbook.getSheetIndex(sheetName);		
	int col_Num=0;		
	sheet = workbook.getSheetAt(index);
	
	//for row
	row=sheet.getRow(0);
	for(int i=0;i<row.getLastCellNum();i++){
		
		if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
			col_Num=i;
	}		
	//for column
	
	row = sheet.getRow(rowNum-1);		
	cell = row.getCell(col_Num);				
	 return cell.getStringCellValue();			
	
	}
	catch(Exception e){
		
		e.printStackTrace();
		return "row "+rowNum+" or column "+colName +" does not exist in xls";
	}
}

}

		
		
		
	
	
	



