package com.puralsight.calengine;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] statements = {
				"add 25.0 92.0",
				"power 5.0 2.0"  
		};
		
		DynamicHandler helper = new DynamicHandler(new MathProcessing[] {
				new Adder(),
				new PowerOf()
		});
		
		for(String statement:statements) {
			String output = helper.process(statement);
			System.out.println(output);
		}

	}

}
