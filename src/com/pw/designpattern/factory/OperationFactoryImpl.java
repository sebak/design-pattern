package com.pw.designpattern.factory;

import com.pw.designpattern.factory.exception.InvalidOperationException;
import com.pw.designpattern.factory.operation.AddOperation;
import com.pw.designpattern.factory.operation.DivOperation;
import com.pw.designpattern.factory.operation.MulOperation;
import com.pw.designpattern.factory.operation.SubOperation;

public class OperationFactoryImpl implements OperationFactory {
    @Override
    public Operation getInstance(OperationType choice) throws InvalidOperationException {
        switch (choice) {
            case MULTIPLY:
                return new MulOperation();
            case DIVIDE:
                return new DivOperation();
            case ADD:
                return new AddOperation();
            case SUBTRACT:
                return new SubOperation();
            default:
                throw new InvalidOperationException("Invalid operation selected!");
        }
    }

    public static void main(String[] args) throws InvalidOperationException {
        OperationFactory operationFactory = new OperationFactoryImpl();
        double a = 4;
        double b = 2;
        Operation multiply = operationFactory.getInstance(OperationType.MULTIPLY);
        System.out.println(String.format("%s * %s = %s", a, b, multiply.calculate(a,b)));

        Operation divide = operationFactory.getInstance(OperationType.DIVIDE);
        System.out.println(String.format("%s / %s = %s", a, b, divide.calculate(a,b)));

        Operation add = operationFactory.getInstance(OperationType.ADD);
        System.out.println(String.format("%s + %s = %s", a, b, add.calculate(a,b)));

        Operation sub = operationFactory.getInstance(OperationType.SUBTRACT);
        System.out.println(String.format("%s - %s = %s", a, b, sub.calculate(a,b)));
    }
}
