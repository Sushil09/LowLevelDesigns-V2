package com.lowleveldesigns.designpatterns.structural.proxy.core;

//contains basic crud operations
public interface DatabaseAccess {
    void create(String name);

    void read();

    void update(String oldName, String newName);

    void delete(String name);
}
