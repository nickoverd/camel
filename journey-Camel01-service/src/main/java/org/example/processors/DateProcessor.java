package org.example.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DateProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        File file = exchange.getIn().getBody(File.class);

        appendTextToFile(file,"edited file");
    }

    private void appendTextToFile(File file, String text) throws IOException {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(text);
        }

    }
}
