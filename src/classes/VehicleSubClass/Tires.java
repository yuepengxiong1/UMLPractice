package classes.VehicleSubClass;

import classes.Vehicle;

public class Tires extends Vehicle implements PersonInteractionTires {
   
    public String tireManufacturer;
    private  int sectionWidth;
    private  int aspectRatio;
    private  String radialConstruction;
    private int tireRadius;
    private int loadRating;
    private String speedRating;
    public static int tirePressurePSI;

    public Tires() {
        this.tireManufacturer = "Generic Manufacturer";
        this.sectionWidth = 205;
        this.aspectRatio = 55;
        this.radialConstruction = "R";
        this.tireRadius = 16;
        this.loadRating = 91;
        this.speedRating = "H";
        this.tirePressurePSI = 32;
    }

    public Tires(String tireManufacturer, int sectionWidth, int aspectRatio, String radialConstruction, int tireRadius, int loadRating, String speedRating, int tirePressurePSI) {
        this.tireManufacturer = tireManufacturer;
        this.sectionWidth = sectionWidth;
        this.aspectRatio = aspectRatio;
        this.radialConstruction = radialConstruction;
        this.tireRadius = tireRadius;
        this.loadRating = loadRating;
        this.speedRating = speedRating;
        Tires.tirePressurePSI = tirePressurePSI;
    }

    @Override
    public void checkTirePressure() {
        System.out.println("Tire pressure is at " + tirePressurePSI + " PSI");
    }

    @Override
    public void fillTiresUpToSpec() {
        System.out.println("Filled tires up to manufacturer spec");
    }
}
