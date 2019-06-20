package ua.lviv.iot.part.manager;

import ua.lviv.iot.part.model.Part;
import ua.lviv.iot.part.model.TransmissionType;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PartManagerImpl implements PartManager {

    private List<Part> parts;

    public PartManagerImpl() {
    }

    public PartManagerImpl(final List<Part> parts) {
        this.parts = parts;
    }

    public final List<Part> getParts() {
        return parts;
    }

    public final void setPart(final List<Part> parts) {
        this.parts = parts;
    }

    @Override
    public void addPart(final Part part) {
    }

    interface SearchableCriteria<T> {
        boolean matchCriteria(T criteria);
    }

    public List<Part> filterPartsByCriteria(final SearchableCriteria<Part> criteria) {
        return parts.stream().filter(part -> criteria.matchCriteria(part)).collect(Collectors.toList());
    }

    public static void sortBySerialNumberAcsending(final List<Part> parts) {
        Collections.sort(parts, Comparator.comparing(Part::getSerialNumber));
    }
    public static void sortBySerialNumberDescending(final List<Part> parts) {
        Collections.sort(parts, Comparator.comparing(Part::getSerialNumber).reversed());
    }

    public final static void sortByProducingCountryAscending(final List<Part> parts) {
        Collections.sort(parts, Comparator.comparing(Part::getProducingCountry));
    }

    public final static void sortByProducingCountryDescending(final List<Part> parts) {
        Collections.sort(parts, Comparator.comparing(Part::getProducingCountry).reversed());
    }

    public final List<Part> filterByTransmissionType(final TransmissionType transmissionType) {
        return filterPartsByCriteria(criteria -> criteria.getTransmissionType().compareTo(transmissionType) == 0);
    }
}


