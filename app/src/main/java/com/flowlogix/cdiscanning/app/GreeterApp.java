package com.flowlogix.cdiscanning.app;

import com.flowlogix.cdiscanning.lib.Greeter;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.event.Startup;
import jakarta.inject.Inject;

@ApplicationScoped
public class GreeterApp {
    @Inject
    Greeter greeter;

    void init(@Observes Startup startup) {
        System.out.printf("Application Started, Greeting %s\n", greeter.greet());
    }
}
