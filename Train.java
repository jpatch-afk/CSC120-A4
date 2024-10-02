public class Train {

    int numCars; 
    int passengerCapacity;
    int maxTrainCapacity; 

    public Train(FuelType f, int numCars, double maxfuelLevel, int passengerCapacity) {
      //  Engine trainEngine = new Engine()
      //ArrayList for cars

    }

    public void getEngine() {
        //System.out.println(trainEngine); 
    }

    public void getCar(int i) {
        //System.out.println(Cars[i])
    }

    public int getMaxCapacity(){
       // for (int i; i < Cars.size(); i)

       return maxTrainCapacity; 
    }

    public int seatsRemaining(int maxCapacity, int passangerCapacity){
        return maxCapacity - passangerCapacity; 
    }

    public void printManifest(){
        //for loop that prints all passenger rosters, Cars Arrays 
    }

 }
