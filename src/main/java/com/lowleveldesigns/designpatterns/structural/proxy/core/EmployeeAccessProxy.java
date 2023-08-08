package com.lowleveldesigns.designpatterns.structural.proxy.core;

import java.util.ArrayList;

public class EmployeeAccessProxy implements DatabaseAccess{

    private EmployeeAccess employeeAccess;
    private String role;

    public EmployeeAccessProxy(String role) {
        this.role = role;
        employeeAccess = new EmployeeAccess();
    }

    @Override
    public void create(String name) {
        if(role.equals("ADMIN")){
            employeeAccess.create(name);
            return;
        }
        System.out.println("You are not allowed to create");
    }

    @Override
    public void read() {

        if(role.equals("ADMIN") || role.equals("USER")){
            employeeAccess.read();
        }
        else{
            System.out.println("Access denied");
        }
    }

    @Override
    public void update(String oldName, String newName) {
        if(role.equals("ADMIN")){
            employeeAccess.update(oldName,newName);
            return;
        }
        System.out.println("You are not allowed to update");
    }

    @Override
    public void delete(String name) {
        if(role.equals("ADMIN")){
            employeeAccess.delete(name);
            return;
        }
        System.out.println("You are not allowed to delete");
    }
}
