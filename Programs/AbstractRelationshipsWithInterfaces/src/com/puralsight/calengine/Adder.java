package com.puralsight.calengine;

/**
 * Created by Jim on 10/10/2015.
 */
public class Adder extends CalculateBase implements MathProcessing {
    public Adder(){}
    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
	@Override
	public String getKeyword() {
		// TODO Auto-generated method stub
		return "add";
	}
	@Override
	public char getSymbol() {
		// TODO Auto-generated method stub
		return '+';
	}
	@Override
	public double doCalculation(double leftVal, double rightVal) {
		setLeftVal(leftVal);
		setRightVal(rightVal);
		calculate();
		return getResult();
	}

}
