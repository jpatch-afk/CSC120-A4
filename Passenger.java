public class Passenger {
    
    String name; 
    int c; 


    public Passenger(String name, int c) {
        this.name = name;
        this.c = c;

    }
     
    public void boardCar(String name, Car c){
        if (passengersOnBoard.size() < maxCapacity) {
            c.addPassenger(name); 
            System.out.println("Passenger added successfully!");
        } 
        else { 
            System.out.println("This car is full. Please pick another one."); 
        }
   
        }

    public void getOffCar(String name, Car c){
        if (passengersOnBoard.contains(name)) { 
            c.removePassenger(name); 
            System.out.println("Passenger removed successfully!");
        } 
        else { 
            System.out.println("This car is full. Please pick another one.");
        }
    
    }

public void main (String[] args) {
    Car myCar = new Car(50);
    Passenger newPassenger = new Passenger("Sophie Brown", 4); 
    newPassenger.boardCar(name, c); 
}

}


