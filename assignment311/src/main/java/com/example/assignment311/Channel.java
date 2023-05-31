package com.example.assignment311;

/*
    TODO:
    The channel of notification can be SMS or Email. 
    Set this class up a @Bean in the main class. Set the type to "SMS".
*/

public class Channel {
    String type;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
