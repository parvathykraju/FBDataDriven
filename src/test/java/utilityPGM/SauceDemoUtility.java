package utilityPGM;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SauceDemoUtility {
	public static int getRowCount(String x1,String Sheet) {
		try
		{
			FileInputStream f1=new FileInputStream(x1);
			XSSFWorkbook wb= new XSSFWorkbook(f1);
			return wb.getSheet(Sheet).getLastRowNum();
		}
		catch(Exception e) {
			return 0;
			
		}
		
		
	}
	
	
	public static String inputString(String X1,String sheet,int r,int c) {
		
		try {
			FileInputStream fi=new FileInputStream(X1);
			XSSFWorkbook wb= new XSSFWorkbook(fi);
			XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING) {
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
				
			}
		}
		catch(Exception e) {
			return null;	
		}
	
		
	}
}
