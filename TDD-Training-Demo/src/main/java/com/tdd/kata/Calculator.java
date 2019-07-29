package com.tdd.kata;

public class Calculator {

	String delimiters = ",|\n";

	public String getMessage() {
		return "Hello World!";
	}

	public int addNumbers(String strParams) {
		int nTotal = 0;
		try {
			String strTokenValue[] = strParams.split(delimiters);
			for (String strValue : strTokenValue) {
				if (!"".equalsIgnoreCase(strValue)) {
					nTotal += Integer.parseInt(strValue);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nTotal;
	}
}
