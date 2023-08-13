package com.lowleveldesigns.designpatterns.behavioral.chainofresponsibility.core;

import java.util.Objects;

public class ErrorLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void setNextLogger(Logger logger) {
        nextLogger = logger;
    }

    @Override
    public void printLog(int level, String message) {
        if (level == 2) {
            System.out.println("Error log: This is a error log "+message);
        } else {
            if (Objects.nonNull(nextLogger))
                nextLogger.printLog(level, message);
        }
    }
}
