package com.lowleveldesigns.designpatterns.behavioral.chainofresponsibility.core;

import java.util.Objects;

public class DebugLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void setNextLogger(Logger logger) {
        nextLogger = logger;
    }

    @Override
    public void printLog(int level, String message) {
        if (level == 0) {
            System.out.println("Debug logs: This is a debug log "+message);
        } else {
            if (Objects.nonNull(nextLogger))
                nextLogger.printLog(level, message);
        }
    }
}
