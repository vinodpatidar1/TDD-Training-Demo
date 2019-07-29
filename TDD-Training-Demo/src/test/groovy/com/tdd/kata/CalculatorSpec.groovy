package com.tdd.kata

import spock.lang.Specification

class CalculatorSpec extends Specification {
	def objCalculator = new Calculator()

	def 'Add numbers from string'(){
		given: 'A string have number with comma seprated'
		when: 'Calculator.addNumbers function calls'
		def nTotal = objCalculator.addNumbers(strParams)
		then: 'it returns sum of numbers'
		nTotal == result
		where:
		strParams		| 	result
		""				|	0
		"3,4"			|	7
		"4\n5"			|	9
		"1\n2,3"		|	6
		"//;\n1;2"		|	3
	}
}
