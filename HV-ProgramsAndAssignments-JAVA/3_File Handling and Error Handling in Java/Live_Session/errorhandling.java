package Live_Session;

public class errorhandling extends Exception {
    public static void main(String[] args) {
    //     try{
    //    // int i=10/0;// execute the try -catch & finally also
    //     //int i=10/10; // execute the program & Finally also
    //    // System.out.println(i);
    //     int [] a1={1,2,3,4,5,6};
    //     System.out.println(a1[8]);

    //     } catch (ArithmeticException e){
    //         // int i=10/1; 
    //         // System.out.println(i);
    //         //System.out.println("An exception occured,since you gave 0 as denominator");
    //     System.out.println(e.getMessage());
        
    //     }finally{
    //         System.out.println("this piece will get executed everytime");
    //     }
// throug method
try{
    int age=18;
    if (age<0){
        throw new Exception("Age cannot be negative no");
     //System.out.println(a1[8]);

     } catch (Exception e){
        System.out.println("An exception occured"+ e.getMessage());
          
    //  }finally{
    //      System.out.println("this piece will get executed everytime");
    //  }




    }
}
