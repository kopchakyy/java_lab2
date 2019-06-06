package ua.lviv.iot.part.model;

public class Transmission extends Part {
    private int numberOfGears;
    private TransmissionType transmissionType;

    public Transmission() {
    }

    public Transmission(int price, String serialNumber, ProducingCountry producingCountry, PartType partType, BrandName brandName, int numberOfGears, TransmissionType transmissionType) {
        super(price, serialNumber, producingCountry, partType, brandName);
        this.numberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }

    public String toString() {
        return super.toString() +
                " numberOfGears" + numberOfGears +
                "transmissionType" + transmissionType;

    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }
}

