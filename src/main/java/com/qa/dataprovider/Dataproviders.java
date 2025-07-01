package com.qa.dataprovider;

import com.qa.utility.ExcelUtils;

public class Dataproviders {
	
	public Object [][] getRegisterData() throws Exception{
		String filePath=System.getProperty("user.dir") + "/src/test/resources/testdata/RegisterData.xlsx";
		return ExcelUtils.getExcelData(filePath, "Sheet1");
		
	}

}
