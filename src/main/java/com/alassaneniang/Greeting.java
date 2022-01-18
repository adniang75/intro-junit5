package com.alassaneniang;

public class Greeting {

    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String helloWorld () {
        return String.format( "%s %s!", HELLO, WORLD );
    }

    public String helloWorld ( String name ) {
        return String.format( "%s %s!", HELLO, name );
    }
    
}
