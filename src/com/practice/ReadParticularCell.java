package com.practice;

public class ReadParticularCell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadParticularCell rc = new ReadParticularCell(); // object of the class
		// reading the value of 2nd row and 2nd column
		String vOutput = rc.ReadCellData(2, 2);
		System.out.println(vOutput);
	}

	// method defined for reading a cell
	public String ReadCellData(int vRow, int vColumn) {
		String value = null; // variable for storing the cell value
		Workbook wb = null; // initialize Workbook null
		try {
			// reading data from a file in the form of bytes
			FileInputStream fis = new FileInputStream("C:\\demo\\EmployeeData.xlsx");
			// constructs an XSSFWorkbook object, by buffering the whole stream into the
			// memory
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Sheet sheet = wb.getSheetAt(0); // getting the XSSFSheet object at given index
		Row row = sheet.getRow(vRow); // returns the logical row
		Cell cell = row.getCell(vColumn); // getting the cell representing the given column
		value = cell.getStringCellValue(); // getting cell value
		return value; // returns the cell value
	}

}
