package com.lowleveldesigns.designpatterns.structural.proxy.core;

public class EmployeeAccess implements DatabaseAccess {

    @Override
    public void create(String name) {
        System.out.println("You are allowed to create");
    }

    @Override
    public void read() {
        System.out.println("You are allowed to read");
    }

    @Override
    public void update(String oldName, String newName) {
        System.out.println("You are allowed to update");
    }

    @Override
    public void delete(String name) {
        System.out.println("You are allowed to delete");
    }
}
