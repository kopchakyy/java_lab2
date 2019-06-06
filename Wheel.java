package ua.lviv.iot.part.model;

public class Wheel extends Part {


    private int numberOfWheels;


    public Wheel () {
    }

    public Wheel(int price, String serialNumber , ProducingCountry producingCountry,PartType partType,BrandName brandName , int numberOfWheels) {
        super(price,serialNumber , producingCountry,partType,brandName);
        this.numberOfWheels = numberOfWheels;

    }

    public String toString() {
        return super.toString() +
                " numberOfWheels " + numberOfWheels ;

    }
    public int getnumberOfWheels() {
        return numberOfWheels;
    }

    public void setnumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
