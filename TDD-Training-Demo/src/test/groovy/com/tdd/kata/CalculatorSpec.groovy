package com.tdd.kata

import spock.lang.Specification

class CalculatorSpec extends Specification {
	def objCalculator = new Calculator()

	def 'Get Message'() {
		expect: 'Should return  the correct message'
		objCalculator.getMessage() == 'Hello World!'
	}
}
