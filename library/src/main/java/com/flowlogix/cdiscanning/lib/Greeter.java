package com.flowlogix.cdiscanning.lib;

import jakarta.enterprise.context.Dependent;

@Dependent
public class Greeter {
    public String greet() {
        return "Hello from Library";
    }
}
