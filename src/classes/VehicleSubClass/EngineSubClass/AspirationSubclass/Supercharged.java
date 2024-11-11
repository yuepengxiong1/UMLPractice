package classes.VehicleSubClass.EngineSubClass.AspirationSubclass;

import classes.VehicleSubClass.EngineSubClass.Aspiration;

public class Supercharged extends Aspiration{
    public final String aspirationType = "Supercharged";
    public String superChargerManufacturer;
    private int forcedInductionPsi;
    private int airFlowRatingInCFM;
    private boolean isCentrifugal;

    public Supercharged() {
        this.superChargerManufacturer = "Generic Manufacturer";
        this.forcedInductionPsi = 0;
        this.airFlowRatingInCFM = 0;
        this.isCentrifugal = false;
    }

    public Supercharged(String superChargerManufacturer, int forcedInductionPsi, int airFlowRatingInCFM, boolean isCentrifugal) {
        this.superChargerManufacturer = superChargerManufacturer;
        this.forcedInductionPsi = forcedInductionPsi;
        this.airFlowRatingInCFM = airFlowRatingInCFM;
        this.isCentrifugal = isCentrifugal;
    }
}
