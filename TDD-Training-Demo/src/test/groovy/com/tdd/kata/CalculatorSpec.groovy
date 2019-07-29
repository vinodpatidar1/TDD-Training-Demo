package com.tdd.kata

import spock.lang.Specification

class CalculatorSpec extends Specification {
	def objCalculator = new Calculator()

	def 'Welcome Message'() {
		expect: 'Should return  the welcome message'
		objCalculator.getMessage() == 'Hello World!'
	}

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
	}
}
