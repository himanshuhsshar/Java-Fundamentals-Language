package com.pluralsight.calengine;

public class Divider extends CalculateBase{
	public Divider() {}
	public Divider(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		double value = getLeftVal() / getRightVal();
		setResult(value);
	}


}
