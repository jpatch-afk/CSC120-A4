import java.util.ArrayList;

public class Car {
    private int maxCapacity; 
    String p;
    private ArrayList <Passenger> passengersOnBoard = new ArrayList <Passenger>();

    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity; 
    }

    public int getCapacity(){
        return this.maxCapacity; 
    }

    public int remainingSeats(){
       return maxCapacity - (passengersOnBoard.size()); 
    }

    public void addPassenger(Passenger p){ 
        if (passengersOnBoard.size() < maxCapacity) {
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

    public void removePassenger(Passenger p){
        if (passengersOnBoard.contains(p)) {
            passengersOnBoard.remove(p); 
            System.out.println("Passenger successfully removed.");
        }
        else {
            System.out.println("Passenger is not on board.");
        }
        
    }

    public void printManifest(){
        if (passengersOnBoard.size() > 0) {
            System.out.println(passengersOnBoard); 
        }
        else {
            System.out.println("This car is empty. Consider filling it with passengers.");
        }
    }

    public static void main (String[] args) {
        Car newCar = new Car(50); 
        newCar.remainingSeats();
    }
}