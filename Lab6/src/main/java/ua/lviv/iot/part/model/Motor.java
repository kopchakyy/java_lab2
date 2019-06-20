package ua.lviv.iot.part.model;

public class Motor extends Part {
    private Type type;

    public Motor(final int price, final String serialNumber, final ProducingCountry producingCountry,
                 final PartType partType, final BrandName brandName, final Type type) {
        super(price, serialNumber, producingCountry, partType, brandName);
        this.type = type;

    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "type";
    }

    public String toCSV() {
        return super.toCSV() + ", " + type;
    }
      
    public final Type getType() {
        return type;
    }

    public final void setType(final Type type) {
        this.type = type;
    }
}

