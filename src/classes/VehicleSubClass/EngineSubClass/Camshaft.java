package classes.VehicleSubClass.EngineSubClass;

import classes.VehicleSubClass.Engine;

public class Camshaft extends Engine{
    public String camshaftManufactuer;
    private int camShaftLSA;
    private int camShaftDuration;
    private int camShaftCamSize;
    private int camProfile;
    private int pistonCount;

    public Camshaft() {
        this.camShaftLSA = 0;
        this.camShaftDuration = 0;
        this.camShaftCamSize = 0;
        this.camProfile = 0;
        this.pistonCount = 0;
    }

    public Camshaft(int camShaftLSA, int camShaftDuration, int camShaftCamSize, int camProfile, int pistonCount) {
        this.camShaftLSA = camShaftLSA;
        this.camShaftDuration = camShaftDuration;
        this.camShaftCamSize = camShaftCamSize;
        this.camProfile = camProfile;
        this.pistonCount = pistonCount;
    }

    public void getPistonCount(int count) {
        pistonCount = count;
    }

    
    public void getSound(){
        System.out.println("Camshaft Sounds");
    }
}
