package org.example.services;

public class NameGreeter implements Greeter {

    public String getGreeting(String name) {
        if (name == null || name.equals("")) 
            return "Hello, world!";
        else {
            return "Hello, " + name + "!";
        }
    }
}
