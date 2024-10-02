import java.util.ArrayList;

public class Car {
    ArrayList<Passenger> passengersOnboard;
    int maxCapacity; 
    String p;

    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity; 
        maxCapacity = 50; 
        ArrayList <Passenger> passengersOnBoard = new ArrayList <Passenger>();
    }

    public int getCapacity(){
        return maxCapacity; 
    }

    public int remainingSeats(){
       return maxCapacity - passengersOnboard.size(); 
    }

    public void addPassenger(Passenger p){ //needs to be changed to boolean to return either true or false 
       
        passengersOnboard.add(p); 
       
    }

    public void removePassenger(Passenger p){
        passengersOnboard.remove(p); 
    }

    public void printManifest(){
        if (passengersOnboard.size() > 0) {
            System.out.println(passengersOnboard); 
        }
        else {
            System.out.println("This car is empty. Consider filling it with passengers.");
        }
    }

    //main to check if everything works 
    }
