public class polymorphisim {
     public static void main(String[] args) {
       Vehicle auto = new Bus();
       System.out.println(auto.getdistanceToEpty(5, 15)) ;
    }
}

class Vehicle  {
    int fuelTank = 10;
    int milage =20; 
    
    int getdistanceToEpty(int milage, int fuelTank){
          System.out.println("second");
         return fuelTank * milage;
    }
}

class Bus extends Vehicle {
    int fuelTank = 10;
    int milage =20; 
    
    int getdistanceToEpty(int milage, int fuelTank){
          System.out.println("Bus second");
         return fuelTank * milage;
    }
}
    