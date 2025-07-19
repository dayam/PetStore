package data;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtils {
	public static String getCell(String filePath, String sheetName, int row, int col) throws Exception {
        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet(sheetName);
        Row r = sheet.getRow(row);
        return r.getCell(col).toString();
    }
}
