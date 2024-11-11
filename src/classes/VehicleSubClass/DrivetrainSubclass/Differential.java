package classes.VehicleSubClass.DrivetrainSubclass;

import classes.Vehicle;
import classes.VehicleSubClass.Drivetrain;

public class Differential extends Drivetrain{
    public String differentialType;
    public String differentialManufactuer;
    private static String differentialModel;
    private static float rearDiffGearRatio;
    private static float frontDiffGearRatio;
    private boolean hasFrontDifferential;

    public Differential() {
        this.differentialType = "Open Differential";
        this.differentialManufactuer = "Generic Manufactuerer";
        this.differentialModel = "Generic Model";
        this.rearDiffGearRatio = 3.0f;
        this.frontDiffGearRatio = 3.0f;
        this.hasFrontDifferential = false;
    }

    public Differential(String differentialType, String differentialManufactuer, String differentialModel, float rearDiffGearRatio, float frontDiffGearRatio, boolean hasFrontDifferential) {
        this.differentialType = differentialType;
        this.differentialManufactuer = differentialManufactuer;
        this.differentialModel = differentialModel;
        this.rearDiffGearRatio = rearDiffGearRatio;
        this.frontDiffGearRatio = frontDiffGearRatio;
        this.hasFrontDifferential = hasFrontDifferential;
    }

    public void getSound() {
        System.out.println("Differential whining");
    }
}
