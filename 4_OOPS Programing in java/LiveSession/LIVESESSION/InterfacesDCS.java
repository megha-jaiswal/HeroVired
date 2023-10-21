// Interfaces
import javax.sound.sampled.SourceDataLine;
interface shape {
    void area();
    void perimeter();
}
class square implements shape{
   @Override 
    public void area(){
        System.out.println("Area of Square:");
    }
@Override 
    public void perimeter(){
        System.out.println("Perimeter of Square:");
    }
}
class circle implements shape{
   @Override 
    public void area(){
        System.out.println("Area of Circle:");
    }
@Override 
    public void perimeter(){
        System.out.println("Perimeter of Circle:");
    }
}

public class InterfacesDCS {
    public static void main(String[] args) {
        circle c= new circle(); /// object creation 
        c.perimeter();
        c.area();
        shape s= new square();
        s.perimeter();
        s.area();
        }
   
}
