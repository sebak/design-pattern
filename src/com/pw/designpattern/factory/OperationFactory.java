package com.pw.designpattern.factory;

import com.pw.designpattern.factory.exception.InvalidOperationException;

public interface OperationFactory {
    Operation getInstance(OperationType choice) throws InvalidOperationException;
}
