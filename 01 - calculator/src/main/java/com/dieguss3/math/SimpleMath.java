package com.dieguss3.math;

public class SimpleMath {

	public Double sum(Double numberOne, Double numberTwo){
		return (Double) numberOne + numberTwo;
	}

	public Double subtraction(Double numberOne, Double numberTwo){
		return (Double) numberOne - numberTwo;
	}

	public Double multiplication(Double numberOne, Double numberTwo){
		return (Double) numberOne * numberTwo;
	}
	
	public Double division(Double numberOne, Double numberTwo){
		return (Double) numberOne / numberTwo;
	}

	public Double squareRoot(Double number){
		return (Double) Math.sqrt(number);
	}
	
}
