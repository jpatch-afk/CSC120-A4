import java.util.ArrayList;

public class Car {
    ArrayList<Passenger> passengersOnboard;
    int maxCapacity; 

    public Car(int maxCapacity, ArrayList<Passenger> passengersOnboard) {
        this.maxCapacity = maxCapacity; 
        maxCapacity = 50; 
        //passengersOnboard.asList(0); initialize the size of the ArrayList, syntax??  
    }

    public int getCapacity(){
        return maxCapacity; 
    }

    public int remainingSeats(){
       return maxCapacity - passengersOnboard.size(); 
    }

    public void addPassenger(Passenger p){ //needs to be changed to boolean to return either true or false 
       
       //passengersOnboard.add(Passenger p); 
       
    }

    public void removePassenger(Passenger p){
        //passengersOnboard.remove(Passenger p); 
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
