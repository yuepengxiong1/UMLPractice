package classes.VehicleSubClass;

import classes.Vehicle; 

public class Engine extends Vehicle implements PersonInteractionEngine {
    private String fuelType;
    public String engineLayout;
    private boolean hasVVT;
    private int boreSize;
    private int strokeSize;
    public int engineSizeInLiters;
    private int pistonCount;
    private int rotorCount;
    private boolean isRotory;
    protected int engineMiles;
    private int oilLevel;

    public Engine() {
        this.fuelType = "Unknown";
        this.engineLayout = "Unknown";
        this.hasVVT = false;
        this.boreSize = 0;
        this.strokeSize = 0;
        this.engineSizeInLiters = 0;
        this.pistonCount = 0;
        this.rotorCount = 0;
        this.isRotory = false;
        this.engineMiles = 0;
        this.oilLevel = 0;
    }

    public Engine(String fuelType, String engineLayout, boolean hasVVT, int boreSize, int strokeSize, int engineSizeInLiters, int pistonCount, int rotorCount, boolean isRotory, int engineMiles, int oilLevel) {
        this.fuelType = fuelType;
        this.engineLayout = engineLayout;
        this.hasVVT = hasVVT;
        this.boreSize = boreSize;
        this.strokeSize = strokeSize;
        this.engineSizeInLiters = engineSizeInLiters;
        this.pistonCount = pistonCount;
        this.rotorCount = rotorCount;
        this.isRotory = isRotory;
        this.engineMiles = engineMiles;
        this.oilLevel = oilLevel;
    }

    public void getSound() {
        System.out.println("Engine idle sound");
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public int getBoreSize() {
        return boreSize;
    }

    public int getStrokeSize() {
        return strokeSize;
    }

    public int getEngineSizeInLiters() {
        return engineSizeInLiters;
    }

    public boolean hasVVT() {
        return hasVVT;
    }

    public void checkOilLevel() {
       System.out.println("Engine Oil level is " + oilLevel);
    }

    @Override
    public void run() {
        System.out.println("Engine is running");
    }

    @Override
    public void changeEngineOil() {
        System.out.println("The oil has been changed");
    }
    
}