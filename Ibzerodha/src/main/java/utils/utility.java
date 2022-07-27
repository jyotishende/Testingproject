package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility {
	
	public static String fetchdatafromexcelsheet() throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\STOCK MENTAIN REPORT.xlsx");
		String file2 =WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		return file2 ;
		
	}

}
