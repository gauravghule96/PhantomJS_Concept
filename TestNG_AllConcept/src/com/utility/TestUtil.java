package com.utility;

import java.util.ArrayList;

import com.exceldata.Xls_Reader;

public class TestUtil {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
		
		try {
			
			reader=new Xls_Reader("E:\\workspace2\\TestNG_\\TestData1.xlsx");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		for (int rowNum = 1; rowNum<=reader.getRowCount("TableTestdata"); rowNum++) {
			
			String firstname=reader.getCellData("TableTestdata", "firstname", rowNum);
			String mobilenumber=reader.getCellData("TableTestdata", "mobilenumber", rowNum);
			String emailID=reader.getCellData("TableTestdata", "surname", rowNum);
			String password=reader.getCellData("TableTestdata", "password", rowNum);
			
			
			Object obj[]={firstname,mobilenumber,emailID,password};
			mydata.add(obj);
			
		}
		
		return mydata;
	}
	
}
