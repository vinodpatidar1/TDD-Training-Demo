package com.tdd.kata;

public class Calculator {

	String delimiters = ",|\n|;";

	public int addNumbers(String strParams) {
		int nTotal = 0;
		try {
			String strTokenValue[] = strParams.split(delimiters);
			for (String strValue : strTokenValue) {
				if (isNumber(strValue)) {
					nTotal += Integer.parseInt(strValue);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nTotal;
	}

	private boolean isNumber(String strValue) {
		boolean bIsNumber = false;
		try {
			int nValue = Integer.parseInt(strValue);
			bIsNumber = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bIsNumber;
	}
	
}
