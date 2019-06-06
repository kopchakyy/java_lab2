package ua.lviv.iot.part.model;


public class Bloc extends Part {
    private String field;


    public Bloc () {
    }

    public Bloc (int price, String serialNumber , ProducingCountry producingCountry ,PartType partType , BrandName brandName , String field) {
        super(price, serialNumber ,producingCountry,partType,brandName);
        this.field = field;

    }

    public String toString() {
        return super.toString() +
                " field " + field ;

    }
    public String getfield() {
        return field;
    }

    public void setfield( String field) {
        this.field = field;
    }
}
