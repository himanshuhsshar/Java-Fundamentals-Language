package com.pluralsight.calengine;

public class Subtracter extends CalculateBase{
	public Subtracter() {}
	public Subtracter(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		double value = getLeftVal() - getRightVal();
		setResult(value);
	}

}
