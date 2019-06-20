package ua.lviv.iot.part.manager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.part.model.*;

class PartWriterTest {

  private List<Part> parts;

  public void setUp() {
    parts = new ArrayList<>();
  }

  @BeforeEach
  public void beforeEach() {

    parts = new ArrayList<>();
    parts.add(new Bloc(140, "LO26039PO", ProducingCountry.USA, PartType.BLOC, BrandName.HONDA, "L"));
    parts.add(new Motor(100, "BC2209KO", ProducingCountry.JAPAN, PartType.MOTOR, BrandName.NISSAN, Type.DIESEL));
    parts.add(new Transmission(200, "AB9090LP", ProducingCountry.CHINA, PartType.BLOC, BrandName.HONDA, 2, TransmissionType.AUTOMATIC));
    parts.add(new Wheel(170, "PC270918LO", ProducingCountry.JAPAN, PartType.WHEEL, BrandName.LEXSUS, 4));
  }

  @Test
  public void testWriteToFile() throws FileNotFoundException, IOException {
    PartWriter.writeToFile(parts);
    File file = new File("out.csv");
    try (FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bufReader = new BufferedReader(isr);) {
    	String line = null;
      String lines = "";
      while ((line = bufReader.readLine()) != null) {
        lines += line + "\n";
      }
      lines = lines.substring(0, lines.length() - 1);
      System.out.println(lines);
      Assertions.assertEquals(
    		  "price, serialNumber, producingCountry, partType, brandName, field\n"
          + "140, LO26039PO, USA, BLOC, HONDA, L\n"
          + "price, serialNumber, producingCountry, partType, brandName, type\n"
          + "100, BC2209KO, JAPAN, MOTOR, NISSAN, DIESEL\n"
          + "price, serialNumber, producingCountry, partType, brandName, numberOfGears, transmissionType\n"
          + "200, AB9090LP, CHINA, BLOC, HONDA, 2, AUTOMATIC\n"
          + "price, serialNumber, producingCountry, partType, brandName, numberOfWheels\n"
          + "170, PC270918LO, JAPAN, WHEEL, LEXSUS, 4",lines);
    } finally {
      System.out.println();
    }
  }
}