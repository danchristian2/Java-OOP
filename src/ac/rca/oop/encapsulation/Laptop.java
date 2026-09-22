package ac.rca.oop.encapsulation;

public class Laptop {

    private int serialNumber;
    private String manufacturer;
    private String model;
    private int manufacturedYear;

    // No-argument constructor
    public Laptop() {
    }

    // Parameterized constructor
    public Laptop(int serialNumber, String manufacturer, String model, int manufacturedYear) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.manufacturedYear = manufacturedYear;
    }

    // Setters
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    // Getters
    public int getSerialNumber() {
        return serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    // Converts the object into readable text
    @Override
    public String toString() {
        return "Laptop{" +
                "serialNumber=" + serialNumber +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", manufacturedYear=" + manufacturedYear +
                '}';
    }
}