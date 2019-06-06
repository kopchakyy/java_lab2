package ua.lviv.iot.part.model;

public abstract class Part {
    private int price;
    private ProducingCountry producingCountry;
    private PartType partType;
    private String serialNumber;
    private BrandName brandName;
    private TransmissionType transmissionType;

    public Part() {
    }

    public Part(int price, String serialNumber, ProducingCountry producingCountry , PartType partType , BrandName brandName) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.producingCountry = producingCountry;
        this.partType = partType;
        this.brandName = brandName;
    }

    public String toString() {
        return "Part{" +
                " price " + price +
                " serialNumber " + serialNumber +
                " producingCountry " + producingCountry +
                "partType" + partType +
                "brandName" + brandName;
    }


    public int getPricet() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ProducingCountry getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(ProducingCountry producingCountry) {
        this.producingCountry = producingCountry;
    }

    public PartType getPartType() {
        return partType;
    }

    public void setPartType(PartType partType) {
        this.partType = partType;
    }

    public BrandName getBrandName() {
        return brandName;
    }

    public void setBrandName(BrandName brandName) {
        this.brandName = brandName;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }
}
