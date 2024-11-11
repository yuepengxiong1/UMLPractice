 
import classes.Vehicle;
import classes.VehicleSubClass.Engine;


public class App extends Vehicle{
    public static void main(String[] args) throws Exception {
       
        Engine engine = new Engine();
        engine.getSound();
    }
}
