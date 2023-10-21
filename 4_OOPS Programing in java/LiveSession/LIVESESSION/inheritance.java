public class inheritance {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Room bedroom = new Room(15,15);
        System.out.println(bedroom.calculateArea());
        System.out.println(bedroom.calculateArea2());
    }
}

class Room {
    int height  ;
    int breadth;
    int length ;
    int noOfWindow ;
    
    Room(int length, int breadth){
        System.out.println("In the constructor");
        this.length = length;
        this.breadth = breadth ;
    }
    
    int calculateArea(){
        int length = 10;
        int breadth = 10;
        return breadth*length ;
    }
    
     int calculateArea2(){
        return breadth*length ;
    }
    
}

