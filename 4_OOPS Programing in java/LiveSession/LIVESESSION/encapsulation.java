public class encapsulation {
       public static void main(String[] args) {
    // Access access = new Access();
    // System.out.println(access.public_int);
    // access.getInt();
    // System.out.println(access.default_int);
    new Temp().getData();
    }
}

class Access {
    public int public_int =10 ;
    private int private_int = 20 ;
    int default_int = 30 ;
    protected int protedted_int = 40 ;
    
    public void getInt(){
        System.out.println(private_int);
    }
    
}

class Temp extends {
    
    public void getData(){
        Access a = new Access();
         System.out.println(a.protedted_int);
    }
}

