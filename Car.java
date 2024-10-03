import java.util.ArrayList;

public class Car {
    int maxCapacity; 
    String p;
    ArrayList <Passenger> passengersOnBoard = new ArrayList <>();

    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity; 
        
    }

    public int getCapacity(){
        return maxCapacity; 
    }

    public int remainingSeats(){
       return maxCapacity - (passengersOnBoard.size()); 
    }

    public void addPassenger(Passenger p){ 
        passengersOnBoard.add(p); 
    }

    public void removePassenger(Passenger p){
        passengersOnBoard.remove(p); 
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
        newCar.getCapacity();
    }
    }
