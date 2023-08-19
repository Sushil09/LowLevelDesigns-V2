package com.lowleveldesigns.designpatterns.behavioral.template;

import com.lowleveldesigns.designpatterns.behavioral.template.core.Cricket;
import com.lowleveldesigns.designpatterns.behavioral.template.core.Football;
import com.lowleveldesigns.designpatterns.behavioral.template.core.Game;

public class Client {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();
        System.out.println("Next Game");
        Game football = new Football();
        football.play();
    }
}
