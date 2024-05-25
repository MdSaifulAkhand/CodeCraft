package utilities;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
	
public static Map<String, Map<String, String>> setMapData() throws Exception{
	
	
	
	
		
		String path = System.getProperty("user.dir")+"/src/test/resource/Datasheets/AmazonDataSheet.xlsx";
		
		FileInputStream fis = new FileInputStream(path);  //FileInputStream is a class to read excel file. FileOutputStream is
		//used to write excel file
		
		//Workbook is used to open our excel page or full excel interface where multiple sheets may present
		Workbook workbook = new XSSFWorkbook(fis); //2 types of workbooks-1)XSSFWorkbook- read xlsx Files 
		//2)HSSFWorkbook- reads XLS files
		
		Sheet sheet = workbook.getSheetAt(0);
		
		int lastRow = sheet.getLastRowNum();
		
		Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>();
		Map<String, String> dataMap = new HashMap<String, String>();
		
		
		for (int i = 0; i<=lastRow; i++){					//Looping over entire row
			Row row = sheet.getRow(i);
			Cell keyCell = row.getCell(0); 					//0th cell as key
			Cell valueCell = row.getCell(1);				//1st cell as value
			
			DataFormatter df = new DataFormatter();			//Cleaning up the data
			String key = df.formatCellValue(keyCell);
			String value = df.formatCellValue(valueCell);
			
			dataMap.put(key, value);						//Putting key & value in dataMap
			excelFileMap.put("AmazonDataSheet", dataMap);		//Putting dataMap to excelFileMap
		}
		
		return excelFileMap;								//Returning excelFileMap
	}
	
	
	
	
	
	public static String getMapData(String key) throws Exception{
		Map<String, String> m = setMapData().get("AmazonDataSheet");
		String value = m.get(key);
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////////////////////////////////////
	
	
	//How to read excel sheets?
	
	/*
	 * 
	 * 
	 * Sheet sh;

		public ExcelReaderr(String filename, String sheetname) throws IOException {

			FileInputStream fis = new FileInputStream(filename);
			Workbook wb = new XSSFWorkbook(fis);

			sh = wb.getSheet(sheetname);

		}

		public Object[][] ExcelToArray() {
			Object[][] t;
			int TotalRows = sh.getPhysicalNumberOfRows();
			int TotalColumns = sh.getRow(0).getPhysicalNumberOfCells();

			t = new Object[TotalRows - 1][TotalColumns];

			for (int r = 1; r < TotalRows; r = r + 1) {

				for (int col = 0; col < TotalColumns; col = col + 1) {
					t[r - 1][col] = getCellData(r,col);
					

				}

			}
			
			return t;
			
			

		}

		public String getCellData(int r, int col) {
			Cell c = sh.getRow(r).getCell(col);
			String value = "";
			
			if (c.getCellType() == Cell.CELL_TYPE_STRING) {
				value = c.getStringCellValue();
			}

			else {

				if (c.getNumericCellValue() % 1 == 0) {
					value = "" + (int) c.getNumericCellValue();

				}

				else {
					value = "" + c.getNumericCellValue();

				}
			}
			return value;
			

		}
	 * 
	 */
	
	
	
	
	
	//---------------------------------------------------------------
	
	//How to read excel sheets?
	
	/*
	 * 
	 * Cell c;


 public static void main(String[] args) throws IOException {
  // TODO Auto-generated method stub
  String s = "data/Sample1.xls";
  
  FileInputStream fis = new FileInputStream(s);
  
  Workbook wb = new HSSFWorkbook(fis);
  
  Sheet sh = wb.getSheet("Sheet1");
  
  for(Row r : sh) {
   
   for(Cell c : r) {
    
       
    if(c.getCellType()==Cell.CELL_TYPE_STRING) {
    String x = c.getStringCellValue();
    //System.out.println(x);
    }
    
    else {
     
     if(c.getNumericCellValue()%1==0)  {
      int i = (int)c.getNumericCellValue();
      //System.out.println(i);
     }
     else{
      double d = c.getNumericCellValue();
     
     //System.out.println(d);
     }
    }   
    
   }
   
  }
  
  
  wb.close();
  fis.close();
 }
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	 
	
	
	//---------------------------------------------------------
	//How to write in excel sheet?
	
	
	/*
	 * 
	 * String s = "data/Sample.xls";
  
  FileOutputStream fos = new FileOutputStream(s);
  
  Workbook wb = new HSSFWorkbook();
  
  Sheet sh = wb.createSheet("Sheet1");
  
  Row r = sh.createRow(1);
  
  Cell c = r.createCell(0);
  
  c.setCellValue("Java");
  
  
  wb.write(fos);
  
  
  wb.close();
  fos.close();
	 * 
	 * 
	 */
	
	
	
	
	

}
