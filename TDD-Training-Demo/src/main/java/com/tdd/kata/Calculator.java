package com.tdd.kata;

import com.exception.NegativeNotSupportedException;

public class Calculator {

	String delimiters = ",|\n|;|\\*";

	public int addNumbers(String strParams) throws Exception {
		int nTotal = 0;
		String strTokenValue[] = strParams.split(delimiters);
		for (String strValue : strTokenValue) {
			if (isNumber(strValue) && Integer.parseInt(strValue) <= 1000) {
				if (Integer.parseInt(strValue) > 0) {
					nTotal += Integer.parseInt(strValue);
				} else {
					throw new NegativeNotSupportedException("Negatives not allowed");
				}
			}
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
