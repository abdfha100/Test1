package dataDrive;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivenExcel {
	public ArrayList<String> getData(String testCaseName) throws IOException {
		// fileinputStream argument
		ArrayList<String> a = new ArrayList<String>();
		
		FileInputStream fis = new FileInputStream("F:\\SeleniumWebDriver\\Datadrive\\DataDriven.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// Identify the Test cases column by scanning the entire 1st row
				Iterator<Row> rows = sheet.iterator(); // sheet is a collections of rows
				Row firstRow = rows.next();
				Iterator<Cell> cell = firstRow.cellIterator(); // row is a collections of cells
				int k = 0;
				int column = 0;
				while (cell.hasNext()) {
					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);

				// Once column is identified then scan the entire test cases column to identify
				// the purchase test-case row
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						// After that grab the purchase test case row. Pull all the data of that row and
						// feed into that test case
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							Cell c = cv.next();
							if (c.getCellTypeEnum() == CellType.STRING) {
								a.add(c.getStringCellValue());
							} else {
								a.add(NumberToTextConverter.toText((c.getNumericCellValue())));
							}
						}
					}
				}
			}
		}
		return a;
	}
}
