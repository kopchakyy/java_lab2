package ua.lviv.iot.part.manager;

import ua.lviv.iot.part.model.Part;
import ua.lviv.iot.part.model.TransmissionType;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PartManager implements lPart {

    private List<Part> part;

    public PartManager() {
    }

    public PartManager(List<Part> part) {
        this.part = part;
    }

    public List<Part> getPart() {
        return part;
    }

    public void setPart(List<Part> part) {
        this.part = part;
    }

    @Override
    public void sortBySerialNumber(List<Part> part, boolean reverse) {
        if (reverse) {
            Collections.sort(part, Comparator.comparing(Part::getSerialNumber).reversed());
        } else {
            Collections.sort(part, Comparator.comparing(Part::getSerialNumber));
        }
    }

    @Override
    public void sortByProducingCountry(List<Part> part, boolean reverse) {
        if (reverse) {
            Collections.sort(part, Comparator.comparing(Part::getProducingCountry).reversed());
        } else {
            Collections.sort(part, Comparator.comparing(Part::getProducingCountry));
        }
    }

    public List<Part> findByProducingCountry(TransmissionType transmissionType, List<Part> findPartList) {

        return part.stream()
                .filter(devices -> devices.getTransmissionType() == transmissionType)
                .collect(Collectors.toList());
    }
}


