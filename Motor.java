package ua.lviv.iot.part.model;

public class Motor extends Part {
    private Type type;

    public Motor (int price, String serialNumber , ProducingCountry producingCountry,PartType partType,BrandName brandName , Type type) {
        super(price,serialNumber , producingCountry,partType,brandName);
        this.type = type;

    }

    public String toString() {
        return super.toString() +
                " Type " + type ;

    }
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}


