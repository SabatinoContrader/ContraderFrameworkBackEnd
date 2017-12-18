package it.contrader.sprint4.dto;


public class GommaDTO {


    private String model;

    private String manufacturer;

    private double price;


    public GommaDTO () {}

    public GommaDTO (String model, String manufacturer, double price)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
