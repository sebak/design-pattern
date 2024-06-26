package com.pw.designpattern.factory.operation;

import com.pw.designpattern.factory.Operation;

// for division
public class DivOperation implements Operation {
    @Override
    public double calculate(double number1, double number2) {
        if (number2 == 0)
            throw new ArithmeticException("Cannot divide by zero!");
        return number1 / number2;
    }
}
