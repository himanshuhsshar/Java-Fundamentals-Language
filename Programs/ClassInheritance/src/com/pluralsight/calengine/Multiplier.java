package com.pluralsight.calengine;

public class Multiplier extends CalculateBase{
	public Multiplier() {}
	public Multiplier(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		double value = getLeftVal() * getRightVal();
		setResult(value);
	}


}
