package org.example.routes;

import org.apache.camel.builder.RouteBuilder;
import org.example.processors.DateProcessor;

public class BackendRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:C:\\Users\\PC-\\Documents\\input\\blah.txt") // Source directory
                .process(new DateProcessor())
                .to("file:C:\\Users\\PC-\\Documents\\output\\blah.txt"); // Destination directory
    }
}
