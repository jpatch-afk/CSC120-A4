public class Engine {

    private FuelType f; 
    private double currentfuelLevel;
    private double maxfuelLevel; 
    boolean enoughFuel;

    /**
     * Constructor 
     * @param f
     * @param maxfuelLevel
     * @param currentfuelLevel
     * @param enoughFuel
     */
    public Engine(FuelType f, double maxfuelLevel, double currentfuelLevel, boolean enoughFuel) {
        this.f = f; 
        this.currentfuelLevel = currentfuelLevel;
        this.maxfuelLevel = maxfuelLevel; 
        this.enoughFuel = enoughFuel; 
    }

    /**
     * Accessor for currentfuelLevel
     * @return currentfuelLevel 
     */
    public double getcurrentfuelLevel() {
        return this.currentfuelLevel; 
    }

    /**
     * Accessor for the engine's maximum fuel level 
     * @return maxfuelLevel
     */
    public double getmaxfuelLevel() {
        return this.maxfuelLevel; 
    }

    /**
     * Accessor for the fuel type of the engine 
     * @return f 
     */
    public FuelType getFuelType() {
        return this.f; 
    }

    /**
     * Resets the current fuel level to the maximum set: refuels the engine
     */
    public void refuel(){
        currentfuelLevel = maxfuelLevel; 
        enoughFuel = true; 
    }

    /**
     * Makes the engine go; checks the fuel levels and returns whether there is enough to run or stops 
     * @return enoughFuel 
     */
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

    /**
     * Main; runs the entire program 
     * @param args
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 100.0, true);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}