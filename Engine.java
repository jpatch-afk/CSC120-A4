public class Engine {

    private FuelType f; 
    private double currentfuelLevel;
    private double maxfuelLevel; 
    boolean enoughFuel;


    public Engine(FuelType f, double maxfuelLevel, double currentfuelLevel, boolean enoughFuel) {
        this.f = f; 
        this.currentfuelLevel = currentfuelLevel;
        this.maxfuelLevel = maxfuelLevel; 
        this.enoughFuel = enoughFuel; 
    }

    public double getcurrentfuelLevel() {
        return this.currentfuelLevel; 
    }

    public double getmaxfuelLevel() {
        return this.maxfuelLevel; 
    }

    public FuelType getFuelType() {
        return this.f; 
    }

    public void refuel(){
        currentfuelLevel = maxfuelLevel; 
        enoughFuel = true; 
    }

    public boolean go() {
        currentfuelLevel -= 5; 
        System.out.println(currentfuelLevel); 
        if (currentfuelLevel > 0) {
            return enoughFuel == true; 
        }
        else if (currentfuelLevel == 0) {
            System.out.println("Fuel Level is 0. Refuel recommended.");
            return enoughFuel == false; 
        }
        else {
            return enoughFuel == false; 
        }
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 100.0, true);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }

}