package classes.VehicleSubClass;

import classes.Vehicle;

public class Drivetrain extends Vehicle{
    protected String drivetrainType;
    protected String driveshaftMaterial;

    public Drivetrain() {
        this.drivetrainType = "FWD";
        this.driveshaftMaterial = "Steel";
    }

    public Drivetrain(String drivetrainType, String driveshaftMaterial) {
        this.drivetrainType = drivetrainType;
        this.driveshaftMaterial = driveshaftMaterial;
    }

    public void getSound(){
        System.out.println("Driveshaft rattling");
    }
}
