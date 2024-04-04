package com.commons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public final class ExcelFileReader {

    private static ExcelFileReader excelFileReader;

    private ExcelFileReader() {
    }

    public static ExcelFileReader getInstance() {
        if (Objects.isNull(excelFileReader)) {
            excelFileReader = new ExcelFileReader();
        }
        return excelFileReader;
    }

    /**
     * Reads the file path and sheet name from the text file.
     *
     * @throws IOException If an I/O error occurs.
     */
    private static void readConfigFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("filepath.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    if (key.equals("PATH")) {
                    } else if (key.equals("SHEET")) {
                    }
                }
            }
        }
    }

    /**
     * Reads test data from the Excel file.
     *
     * @return  test data.
     */
    public Object[][] getTestData() {
        Object[][] testData = null;

        try {
            readConfigFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return testData;
    }
}
