package classes;

public abstract class Vehicle{
    private int year;
    private int msrp;
    private String manufacturer;
    private String model;
    private int wheelCount;
    private int fuelTankCapacity;
    private int chassisMiles;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMsrp() {
        return msrp;
    }

    public void setMsrp(int msrp) {
        this.msrp = msrp;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public int getChassisMiles() {
        return chassisMiles;
    }

    public void setChassisMiles(int chassisMiles) {
        this.chassisMiles = chassisMiles;
    }

    public void getSound(){
        System.out.println("No noise generated");
    }


}