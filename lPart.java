package ua.lviv.iot.part.manager;
import java.util.List;

import ua.lviv.iot.part.model.Part;

public interface lPart {
    public void sortByProducingCountry(List<Part> part, boolean reverse);

    public void sortBySerialNumber(List<Part> part,boolean reverse);

}
