package org.example;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.example.routes.BackendRoute;

public class Main {
    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new BackendRoute());

        context.start();
        System.out.println("Camel context started. Press Ctrl+C to stop.");

        // Keep the application running until manually stopped

        context.stop();
    }
}