package ua.lviv.iot.part.model;

public class Wheel extends Part {


    private int numberOfWheels;


    public Wheel() {
    }

    public Wheel(final int price, final String serialNumber, final ProducingCountry producingCountry,
                 final PartType partType, final BrandName brandName, final int numberOfWheels) {
        super(price, serialNumber, producingCountry, partType, brandName);
        this.numberOfWheels = numberOfWheels;
    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "numberOfWheels";
    }

    public String toCSV() {
        return super.toCSV() + ", " + numberOfWheels;
    }
      
    public final int getnumberOfWheels() {
        return numberOfWheels;
    }

    public final void setnumberOfWheels(final int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
