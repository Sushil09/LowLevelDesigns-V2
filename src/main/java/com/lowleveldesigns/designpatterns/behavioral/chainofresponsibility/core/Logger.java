package com.lowleveldesigns.designpatterns.behavioral.chainofresponsibility.core;

public interface Logger {
    void setNextLogger(Logger logger);
    void printLog(int level, String message);
}
