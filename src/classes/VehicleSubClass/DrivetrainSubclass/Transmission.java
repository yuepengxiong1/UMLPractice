package classes.VehicleSubClass.DrivetrainSubclass;

import classes.VehicleSubClass.Drivetrain;
import classes.VehicleSubClass.PersonInteractionTransmission;

public class Transmission extends Drivetrain implements PersonInteractionTransmission{
    public String carShiftingType;
    private String transmissionType;
    public String transmissionManufactuer;
    private int numberOfGears;
    private String clutchType;
    private float[] gearRatios;
    private int flywheelWeight;

    
    public Transmission() {
        this.carShiftingType = "Automatic";
        this.transmissionType = "CVT";
        this.transmissionManufactuer = "Default Manufacturer";
        this.numberOfGears = 6;
        this.clutchType = "Single";
        this.gearRatios = new float[]{3.5f, 2.1f, 1.4f, 1.0f, 0.8f, 0.6f};
        this.flywheelWeight = 10;
    }

    
    public Transmission(String carShiftingType, String transmissionType, String transmissionManufactuer, int numberOfGears, String clutchType, float[] gearRatios, int flywheelWeight) {
        this.carShiftingType = carShiftingType;
        this.transmissionType = transmissionType;
        this.transmissionManufactuer = transmissionManufactuer;
        this.numberOfGears = numberOfGears;
        this.clutchType = clutchType;
        this.gearRatios = gearRatios;
        this.flywheelWeight = flywheelWeight;
    }

	@Override
	public void shiftGearUp() {
		System.out.println("Gear shifted up 1 gear");
	}

	@Override
	public void automaticShiftInto(String gear) {
		System.out.println("Gear shifted into " + gear);
	}

	@Override
	public void shiftGearDown() {
		System.out.println("Gear shifted down 1 gear");
	}

    public void getSound(){
        System.out.println("Gearbox whining");
    }
	
}
