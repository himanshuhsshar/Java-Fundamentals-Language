package com.pluralsight.calengine;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] statements = {
                "divide 100.0 50.0",   // 100.0 / 50.0 = 2.0
                "add 25.0 92.0",       // 25.0 + 92.0 = 117.0
                "subtract 225.0 17.0", // 225.0 - 17.0 = 108.0
                "multiply 11.0 3.0"    // 11.0 * 3.0 = 33.0
        };
		CalculateHelper helper = new CalculateHelper();
        for(String statement:statements) {
            helper.process(statement);
            System.out.println(helper);
        }


	}

}
