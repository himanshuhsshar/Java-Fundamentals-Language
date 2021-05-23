package com.pluralsight.calengine;

public class Adder extends CalculateBase{
	
	public Adder() {}
	public Adder(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		double value = getLeftVal() + getRightVal();
		setResult(value);
	}

}
