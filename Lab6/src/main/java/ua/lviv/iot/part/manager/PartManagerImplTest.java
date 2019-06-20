package ua.lviv.iot.part.manager;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.part.model.Bloc;
import ua.lviv.iot.part.model.BrandName;
import ua.lviv.iot.part.model.Motor;
import ua.lviv.iot.part.model.Part;
import ua.lviv.iot.part.model.PartType;
import ua.lviv.iot.part.model.ProducingCountry;
import ua.lviv.iot.part.model.Transmission;
import ua.lviv.iot.part.model.TransmissionType;
import ua.lviv.iot.part.model.Type;
import ua.lviv.iot.part.model.Wheel;

public class PartManagerImplTest {
    private List<Part> actualList = new ArrayList<>();
    private PartManagerImpl partManager = new PartManagerImpl();
    //private  Part = null;
    
    @BeforeEach
    private void setUp() {

        actualList = new ArrayList<>();
        partManager.addPart(new Motor(100, "BC2209KO", ProducingCountry.JAPAN, PartType.MOTOR, BrandName.NISSAN, Type.DIESEL));
        partManager.addPart(new Bloc(140, "LO26039PO", ProducingCountry.USA, PartType.BLOC, BrandName.HONDA, "L"));
        partManager.addPart(new Wheel(170, "PC270918LO", ProducingCountry.JAPAN, PartType.WHEEL, BrandName.LEXSUS, 4));
        partManager.addPart(new Transmission(200, "AB9090LP", ProducingCountry.CHINA, PartType.BLOC, BrandName.HONDA, 2, TransmissionType.AUTOMATIC));
        Part ob1 = new Motor(100, "BC2209KO", ProducingCountry.JAPAN, PartType.MOTOR, BrandName.NISSAN, Type.DIESEL);
        Part ob2 = new Bloc(140, "LO26039PO", ProducingCountry.USA, PartType.BLOC, BrandName.HONDA, "L");
        Part ob3 = new Wheel(170, "PC270918LO", ProducingCountry.JAPAN, PartType.WHEEL, BrandName.LEXSUS, 4);
        Part ob4 = new Transmission(200, "AB9090LP", ProducingCountry.CHINA, PartType.BLOC, BrandName.HONDA, 2, TransmissionType.AUTOMATIC);
        actualList.add(ob1);
        actualList.add(ob2);
        actualList.add(ob3);
        actualList.add(ob4);
        //partManager.addPart((Part) Arrays.asList(ob1, ob2, ob3, ob4));
    }

    @Test
    void testFilterByTransmissionType() {
        Assertions.assertEquals(0, partManager.filterByTransmissionType(TransmissionType.MECHANICAL).size());
        Assertions.assertEquals(1, partManager.filterByTransmissionType(TransmissionType.AUTOMATIC).size());
    }

    @Test
    void testProducingCountryDescending() {
    	//List<Part> parts;
        PartManagerImpl.sortByProducingCountryDescending(actualList);
        Assertions.assertEquals(ProducingCountry.JAPAN, actualList.get(0).getProducingCountry());
        
    }

    @Test
    void testProducingCountryAscending() {
    	//List<Part> parts;
        PartManagerImpl.sortByProducingCountryAscending(actualList);
        Assertions.assertEquals(ProducingCountry.USA, actualList.get(0).getProducingCountry());
    }

    @Test
    void testPSerialNumberDescending() {
        //List<Part> parts;
		PartManagerImpl.sortBySerialNumberDescending(actualList);
        Assertions.assertEquals("AB9090LP", actualList.get(0).getSerialNumber());
    }

   @Test
   final void testSetNewList () {
	   ArrayList list = new ArrayList<>();
	   list.add(new Motor(100, "BC2209KO", ProducingCountry.JAPAN, PartType.MOTOR, BrandName.NISSAN, Type.DIESEL));
	   list.add(new Bloc(140, "LO26039PO", ProducingCountry.USA, PartType.BLOC, BrandName.HONDA, "L"));
	   list.add(new Wheel(170, "PC270918LO", ProducingCountry.JAPAN, PartType.WHEEL, BrandName.LEXSUS, 4));
	   list.add(new Transmission(200, "AB9090LP", ProducingCountry.CHINA, PartType.BLOC, BrandName.HONDA, 2, TransmissionType.AUTOMATIC));
	   Assertions.assertEquals(4,list.size());
	   
	   
   }
}