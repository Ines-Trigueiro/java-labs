package org.example.services;

public class RoleGreeter implements Greeter {

    public String getGreeting(String name) {
        if (name == null || name.equals("")) 
            return "Hello, employee!";
        else {
            return "Hello, " + name + "! You are a new employee!";
        }
    }

    public int calculateSalery(String name) {return 0;}
}
