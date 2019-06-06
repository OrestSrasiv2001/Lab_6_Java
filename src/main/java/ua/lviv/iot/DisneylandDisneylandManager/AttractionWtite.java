package ua.lviv.iot.DisneylandDisneylandManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

import ua.lviv.iot.Attraction.Attraction;

    public class AttractionWtite {

        public AttractionWtite() {

        }

        public final void writeToFile(final List<Attraction> list, final File file) throws IOException {
            try (FileOutputStream fileOutputStream = new FileOutputStream(file);
                 OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
                 BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {

                for (Attraction attraction :  list) {
                        bufferedWriter.write(attraction.getHeaders());
                        bufferedWriter.newLine();
                        bufferedWriter.write(attraction.toCSV());
                        bufferedWriter.newLine();
                }
            }
        }
    }
