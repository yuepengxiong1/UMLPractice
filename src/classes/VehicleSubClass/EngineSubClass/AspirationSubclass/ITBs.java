package classes.VehicleSubClass.EngineSubClass.AspirationSubclass;

import classes.VehicleSubClass.EngineSubClass.Aspiration;

public class ITBs extends Aspiration{
    public final String aspirationType = "Individual Throttle Bodies";
    public String itbManufacturer;
    private int runnerLength;
    private int numberOfRunners;
    private String runnerMaterialType;
    private boolean hasFilter;
    private boolean isRunnerLengthVariable;
    private int airFlowRatingInCFM;

    public ITBs() {
        this.itbManufacturer = "Default Manufacturer";
        this.runnerLength = 0;
        this.numberOfRunners = 4;
        this.runnerMaterialType = "Aluminum";
        this.hasFilter = true;
        this.isRunnerLengthVariable = false;
        this.airFlowRatingInCFM = 0;
    }

    public ITBs(String itbManufacturer, int runnerLength, int numberOfRunners, String runnerMaterialType, boolean hasFilter, boolean isRunnerLengthVariable, int airFlowRatingInCFM) {
        this.itbManufacturer = itbManufacturer;
        this.runnerLength = runnerLength;
        this.numberOfRunners = numberOfRunners;
        this.runnerMaterialType = runnerMaterialType;
        this.hasFilter = hasFilter;
        this.isRunnerLengthVariable = isRunnerLengthVariable;
        this.airFlowRatingInCFM = airFlowRatingInCFM;
    }

    public String getItbManufacturer() {
        return itbManufacturer;
    }

    public int getRunnerLength() {
        return runnerLength;
    }

    public int getNumberOfRunners() {
        return numberOfRunners;
    }

    public String getRunnerMaterialType() {
        return runnerMaterialType;
    }

    public boolean isHasFilter() {
        return hasFilter;
    }

    public boolean isRunnerLengthVariable() {
        return isRunnerLengthVariable;
    }

    public int getAirFlowRatingInCFM() {
        return airFlowRatingInCFM;
    }
}
