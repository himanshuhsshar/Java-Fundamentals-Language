package com.puralsight.calengine;

public interface MathProcessing {
	String SEPERATOR=" ";
	String getKeyword();  //add
	char getSymbol(); // +
	double doCalculation(double leftVal,double rightVal);
}
