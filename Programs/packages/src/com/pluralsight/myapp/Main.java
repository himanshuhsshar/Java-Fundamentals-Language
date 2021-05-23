package com.pluralsight.myapp;

import com.pluralsight.calengine.CalculateHelper;
import com.pluralsight.calengine.InvalidStatementException;

public class Main {

    public static void main(String[] args) {
//        useMathEquation();
//        useCalculatorBase();

        String[] statements = {
                "add 1.0",             // Error: incorrect number of values
                "add xx 25.0",         // Error: non-numeric data
                "addX 0.0 0.0",        // Error: invalid command
                "divide 100.0 50.0",   // 100.0 / 50.0 = 2.0
                "add 25.0 92.0",       // 25.0 + 92.0 = 117.0
                "subtract 225.0 17.0", // 225.0 - 17.0 = 108.0
                "multiply 11.0 3.0"    // 11.0 * 3.0 = 33.0
        };

        CalculateHelper helper = new CalculateHelper();
        for(String statement:statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch(InvalidStatementException e) {
                System.out.println(e.getMessage());
                if(e.getCause() != null)
                    System.out.println("  Original exception: " + e.getCause().getMessage());
            }
        }


    }

}
