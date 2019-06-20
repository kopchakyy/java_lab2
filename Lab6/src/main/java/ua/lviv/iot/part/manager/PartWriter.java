package ua.lviv.iot.part.manager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.part.model.Part;

public class PartWriter {

	public static void writeToFile(List<Part> parts)

      throws FileNotFoundException, IOException {

    File file = new File("out.csv");

    try (FileOutputStream fos = new FileOutputStream(file);

        OutputStreamWriter osw = new OutputStreamWriter(fos);

        BufferedWriter bufWriter = new BufferedWriter(osw);) {

      for (Part part:parts) {

        bufWriter.write(

            part.getHeaders() + "\n"

            		+ part.toCSV() + "\n"
        );
      }
    } finally {
      System.out.println();
    }
  }
}