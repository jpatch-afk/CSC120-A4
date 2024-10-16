import java.util.ArrayList;

/**
 * Class Car; sets the attributes 
 */
public class Car {
    private int maxCapacity; 
    String p;
    private ArrayList <Passenger> passengersOnBoard = new ArrayList <Passenger>();

    /**
     * Constructor 
     * @param maxCapacity
     */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity; 
    }

    /**
     * Accessor for maxCapacity 
     * @return maxCapacity
     */
    public int getCapacity(){
        return this.maxCapacity; 
    }

    /**
     * Calculates the remaining seats of the car 
     * @return int 
     */
    public int remainingSeats(){
       return maxCapacity - (passengersOnBoard.size()); 
    }

    /**
     * Adds passengers to the car 
     * @param p
     */
    public void addPassenger(Passenger p){ 
        if (passengersOnBoard.size() < maxCapacity){
            if (passengersOnBoard.contains(p)) {
                System.out.println("Passenger is already on board.");
            }
            else {
                passengersOnBoard.add(p); 
            }
        }
        else {
            System.out.println("Car is full. Cannot add passenger. Try again."); 
        } 
    }

    /**
     * Removes passengers from the car
     * @param p
     */
    public void removePassenger(Passenger p){
        if (passengersOnBoard.contains(p)) {
            passengersOnBoard.remove(p); 
            System.out.println("Passenger successfully removed.");
        }
        else {
            System.out.println("Passenger is not on board.");
        }
        
    }

    /**
     * Prints the passengers on board 
     */
    public void printManifest(){
        if (passengersOnBoard.size() > 0) {
            System.out.println(passengersOnBoard); 
        }
        else {
            System.out.println("This car is empty. Consider filling it with passengers.");
        }
    }
    /**
     * Main; runs the program 
     * @param args
     */
    public static void main (String[] args) {
        Car newCar = new Car(50); 
        newCar.remainingSeats();
    }
}