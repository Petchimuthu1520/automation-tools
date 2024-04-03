package com.commons;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.Objects;

public final class ExcelFileReader {

    private static final String PATH = "C:\\Users\\V Karthick\\Downloads\\test.xlsx";
    private static final String SHEET_NAME = "Sheet1";
    private static ExcelFileReader excelFileReader;

    public ExcelFileReader() {
    }

    public static ExcelFileReader getInstance() {
        if (Objects.isNull(excelFileReader)) {
            excelFileReader = new ExcelFileReader();
        }

        return excelFileReader;
    }

    public Object[][] getTestData() {
        Object[][] testData = null;

        try (FileInputStream fileInputStream = new FileInputStream(PATH);

            final Workbook workbook = WorkbookFactory.create(fileInputStream)) {
            final Sheet sheet = workbook.getSheet(SHEET_NAME);
            final int rowCount = sheet.getPhysicalNumberOfRows();
            final int colCount = sheet.getRow(0).getLastCellNum();
            testData = new Object[rowCount][colCount];

            for (int i = 0; i < rowCount; i++) {
                final Row row = sheet.getRow(i);
                for (int j = 0; j < colCount; j++) {
                    Cell cell = row.getCell(j);
                    testData[i][j] = cell.getStringCellValue();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return testData;
    }
}