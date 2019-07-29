package com.tdd.kata

import com.exception.NegativeNotSupportedException

import spock.lang.Specification

class CalculatorSpec extends Specification {
	def objCalculator = new Calculator()

	def 'Add numbers from string'(){
		given: 'A string have number with comma separated'
		when: 'Calculator.addNumbers function calls'
		def nTotal = objCalculator.addNumbers(strParams)
		then: 'it returns sum of numbers'
		nTotal == result
		where:
		strParams			| 	result
		""					|	0
		"3,4"				|	7
		"4\n5"				|	9
		"1\n2,3"			|	6
		"//;\n1;2"			|	3
		"2\n1001"			| 	2
		"10***20\n30;5,3"	|	68
		"//[***]\n1***2***3"|	6
	}
	
	def 'Add with a negative number'(){
		given: 'A string have negative number with comma separated'
		when: 'Calculator.addNumbers function calls'
		def nTotal = objCalculator.addNumbers("-10,-4")
		then: 'it should throw NegativeNotSupportedException'
		NegativeNotSupportedException ex = thrown()
		ex.getMessage() == "Negatives not allowed"
	}
}
