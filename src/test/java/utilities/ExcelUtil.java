package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

    public static Map<String, List<Map<String, String>>> readWorkbookAsMap(String workbookName) {
        Map<String, List<Map<String, String>>> workbookData = new HashMap<>();

        try (FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + workbookName);
             XSSFWorkbook wb = new XSSFWorkbook(fis)) {

            int totalSheets = wb.getNumberOfSheets();

            for (int s = 0; s < totalSheets; s++) {
                Sheet sheet = wb.getSheetAt(s);
                String sheetName = sheet.getSheetName();

                int totalRows = sheet.getPhysicalNumberOfRows();
                int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();

                List<Map<String, String>> sheetData = new ArrayList<>();

                // loop rows starting from 1 (skip header row)
                for (int r = 1; r < totalRows; r++) {
                    Row row = sheet.getRow(r);
                    if (row == null) continue; // skip empty row

                    Map<String, String> rowData = new LinkedHashMap<>();
                    for (int c = 0; c < totalColumns; c++) {
                        Cell headerCell = sheet.getRow(0).getCell(c);
                        Cell cell = row.getCell(c);

                        if (headerCell == null) continue;

                        String columnName = headerCell.getStringCellValue();
                        String columnValue = (cell == null) ? "" : cell.toString();

                        rowData.put(columnName, columnValue);
                    }
                    sheetData.add(rowData);
                }
                workbookData.put(sheetName, sheetData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return workbookData;
    }
}
