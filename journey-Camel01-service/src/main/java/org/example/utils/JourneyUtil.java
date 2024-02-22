package org.example.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JourneyUtil {


    public void appendTextToFile(File file, String text) throws IOException {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(text);
        }
    }

}
