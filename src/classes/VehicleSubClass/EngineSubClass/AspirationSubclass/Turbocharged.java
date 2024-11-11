package classes.VehicleSubClass.EngineSubClass.AspirationSubclass;

import classes.VehicleSubClass.EngineSubClass.Aspiration;

public class Turbocharged extends Aspiration{
    public final String aspirationType = "Turbocharged";
    public String turboManufacturer;
    public int forcedInductionPsi;
    private int turboCount;
    private int inducerFanSize;
    private int exducerFanSize;
    private int intakeSideInMM;
    private int exhaustSideInMM;

    
    public Turbocharged() {
        this.turboManufacturer = "Generic";
        this.forcedInductionPsi = 10;
        this.turboCount = 1;
        this.inducerFanSize = 50;
        this.exducerFanSize = 60;
        this.intakeSideInMM = 70;
        this.exhaustSideInMM = 80;
    }

   
    public Turbocharged(String turboManufacturer, int forcedInductionPsi, int turboCount, int inducerFanSize, int exducerFanSize, int intakeSideInMM, int exhaustSideInMM) {
        this.turboManufacturer = turboManufacturer;
        this.forcedInductionPsi = forcedInductionPsi;
        this.turboCount = turboCount;
        this.inducerFanSize = inducerFanSize;
        this.exducerFanSize = exducerFanSize;
        this.intakeSideInMM = intakeSideInMM;
        this.exhaustSideInMM = exhaustSideInMM;
    }


    public String getTurboManufacturer() {
        return turboManufacturer;
    }

    public void setTurboManufacturer(String turboManufacturer) {
        this.turboManufacturer = turboManufacturer;
    }

    public int getForcedInductionPsi() {
        return forcedInductionPsi;
    }

    public void setForcedInductionPsi(int forcedInductionPsi) {
        this.forcedInductionPsi = forcedInductionPsi;
    }

    public int getTurboCount() {
        return turboCount;
    }

    public void setTurboCount(int turboCount) {
        this.turboCount = turboCount;
    }

    public int getInducerFanSize() {
        return inducerFanSize;
    }

    public void setInducerFanSize(int inducerFanSize) {
        this.inducerFanSize = inducerFanSize;
    }

    public int getExducerFanSize() {
        return exducerFanSize;
    }

    public void setExducerFanSize(int exducerFanSize) {
        this.exducerFanSize = exducerFanSize;
    }

    public int getIntakeSideInMM() {
        return intakeSideInMM;
    }

    public void setIntakeSideInMM(int intakeSideInMM) {
        this.intakeSideInMM = intakeSideInMM;
    }

    public int getExhaustSideInMM() {
        return exhaustSideInMM;
    }

    public void setExhaustSideInMM(int exhaustSideInMM) {
        this.exhaustSideInMM = exhaustSideInMM;
    }
}
