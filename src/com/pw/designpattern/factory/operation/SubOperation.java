package com.pw.designpattern.factory.operation;

import com.pw.designpattern.factory.Operation;

// for substration
public class SubOperation implements Operation {
    @Override
    public double calculate(double number1, double number2) {
        return number1 - number2;
    }
}
