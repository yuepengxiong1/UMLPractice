package classes.VehicleSubClass.EngineSubClass;

import classes.VehicleSubClass.Engine;

public class Aspiration extends Engine{
    public String aspirationType;
    private int psi;
    private int airFlowRatingInCFM;

    public Aspiration() {
        this.aspirationType = "NA";
        this.psi = 0;
        this.airFlowRatingInCFM = 0;
    }

    public Aspiration(String aspirationType, int psi, int airFlowRatingInCFM) {
        this.aspirationType = aspirationType;
        this.psi = psi;
        this.airFlowRatingInCFM = airFlowRatingInCFM;
    }

   
    public String getAspirationType() {
        return aspirationType;
    }

    public void setAspirationType(String aspirationType) {
        this.aspirationType = aspirationType;
    }

    public int getPsi() {
        return psi;
    }

    public void setPsi(int psi) {
        this.psi = psi;
    }

    public int getAirFlowRatingInCFM() {
        return airFlowRatingInCFM;
    }

    public void setAirFlowRatingInCFM(int airFlowRatingInCFM) {
        this.airFlowRatingInCFM = airFlowRatingInCFM;
    }

    public void getSound(){
        if (aspirationType == "NA"){
            System.out.println("Muted intake sounds");
        } else if (aspirationType == "ITBs"){
            System.out.println("Aggressive intake sounds");
        } else if (aspirationType == "Supercharger"){
            System.out.println("Supercharger whine noise");
        } else if (aspirationType == "Turbocharged"){
            System.out.println("Turbo intaking air noise");
        } else {
            System.out.println("No aspiration sounds were played");
        }
    }
}
