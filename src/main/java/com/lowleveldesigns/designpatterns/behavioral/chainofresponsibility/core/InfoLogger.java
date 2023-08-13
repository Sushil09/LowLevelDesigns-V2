package com.lowleveldesigns.designpatterns.behavioral.chainofresponsibility.core;

import java.util.Objects;

public class InfoLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void setNextLogger(Logger logger) {
        nextLogger = logger;
    }

    @Override
    public void printLog(int level, String message) {
        if (level == 1) {
            System.out.println("This is info. log "+message);
        } else {
            if (Objects.nonNull(nextLogger)) {
                nextLogger.printLog(level, message);
            }
        }
    }
}
