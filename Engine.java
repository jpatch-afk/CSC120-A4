public class Engine {

    FuelType f; 
    double currentfuelLevel;
    double maxfuelLevel; 
    boolean enoughFuel; 

    public Engine(FuelType f, double currentfuelLevel, double maxfuelLevel, FuelType FuelType, boolean enoughFuel) {
        //this.FuelType = FuelType; need to figure out FuelType 
        this.currentfuelLevel = currentfuelLevel;
        this.maxfuelLevel = maxfuelLevel; 
        this.enoughFuel = enoughFuel; 
    }

    public void refuel() {
        currentfuelLevel = maxfuelLevel; 
        enoughFuel = true; 
    }

    public boolean go() {
        currentfuelLevel -= 5; 
        System.out.println(currentfuelLevel); 
        if (currentfuelLevel > 0) {
            return enoughFuel == true; 
        }
        else {
            return enoughFuel == false; 
        }
    }

    // public static void main(String[] args) {
    //     Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    //     while (myEngine.go()) {
    //         System.out.println("Choo choo!");
    //     }
    //     System.out.println("Out of fuel.");
    // }

    //add accessors? Check java book and online

}