package com.lowleveldesigns.designpatterns.structural.proxy;

import com.lowleveldesigns.designpatterns.structural.proxy.core.EmployeeAccessProxy;

public class Client {
    public static void main(String[] args) {
        EmployeeAccessProxy adminEmployee = new EmployeeAccessProxy("ADMIN");
        adminEmployee.create("David");
        adminEmployee.create("Varun");
        adminEmployee.create("Vishal");
        adminEmployee.delete("Vishal");
        adminEmployee.read();

        EmployeeAccessProxy userEmployee = new EmployeeAccessProxy("USER");
        userEmployee.update("Varun","Vk");
        userEmployee.read();

    }
}
