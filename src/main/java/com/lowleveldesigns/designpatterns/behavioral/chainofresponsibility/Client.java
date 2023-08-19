package com.lowleveldesigns.designpatterns.behavioral.chainofresponsibility;

import com.lowleveldesigns.designpatterns.behavioral.chainofresponsibility.core.DebugLogger;
import com.lowleveldesigns.designpatterns.behavioral.chainofresponsibility.core.ErrorLogger;
import com.lowleveldesigns.designpatterns.behavioral.chainofresponsibility.core.InfoLogger;
import com.lowleveldesigns.designpatterns.behavioral.chainofresponsibility.core.Logger;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Logger logger = new DebugLogger();
        Logger infoLogger = new InfoLogger();
        Logger errorLogger = new ErrorLogger();

        logger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(errorLogger);

        logger.printLog(0,"Test debug log");
        logger.printLog(1,"Test info. log");
        logger.printLog(2,"Test error log");


        List<Integer> list = new ArrayList<>();
        list.iterator();


    }
}
