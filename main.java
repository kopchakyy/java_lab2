package ua.lviv.iot.part;


import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.part.manager.PartManager;
import ua.lviv.iot.part.model.*;

public class main {
    public static void main(String[] args) {


        PartManager manager = new PartManager() {
            @Override
            public void sortBySerialNumber(List<Part> listPart) {

            }
        };


        Motor motor = new Motor (100, 22, ProducingCountry.JAPAN, PartType.MOTOR,BrandName.NISSAN, Type.DIESEL);
        Bloc bloc = new Bloc (140, 26, ProducingCountry.USA, PartType.BLOC,BrandName.HONDA, "L");
        Wheel wheel = new Wheel (170, 27, ProducingCountry.JAPAN, PartType.WHEEL,BrandName.LEXSUS, 4);
        Transmission transmission = new Transmission (155, 21, ProducingCountry.CHINA, PartType.TRANSMISSION,BrandName.SUZUKI, TransmissionType.AUTOMATIC);

        List<Part> listPart = new ArrayList();
        listPart.add(motor);
        listPart.add(bloc);
        listPart.add(wheel);
        listPart.add(transmission);

        manager.sortBySerialNumber(listPart, false);
        System.out.print(listPart);
        manager.sortByProducingCountry(listPart, false);
        System.out.print(listPart);
    }

}

