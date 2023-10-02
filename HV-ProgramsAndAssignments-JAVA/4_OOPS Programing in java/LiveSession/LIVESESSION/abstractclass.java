
    public class abstractclass {
    public static void main(String[] args) {
    //BuildHouse cottage = new Cottage();
    BuildHouse cottage = new MultiStory();
    cottage.build() ;
    }
}

abstract class BuildHouse  {
   abstract void buildBasement();
   abstract void buildPiller();
   abstract void buildWalls();
   abstract void buildRoof();
   
   void  build(){
       buildBasement();
       buildPiller();
       buildWalls();
       buildRoof();
   }
}

class Cottage extends BuildHouse {
     void buildBasement(){
         System.out.println("With mud");
     };
    void buildPiller(){
           System.out.println("With Wood");
    }
    void buildWalls(){
         System.out.println("With Bamboo");
     };
    void buildRoof(){
         System.out.println("With Hay");
     };
    
}
    class MultiStory extends BuildHouse {
     void buildBasement(){
         System.out.println("With concrete");
     };
    void buildPiller(){
           System.out.println("With iron rod");
    }
    void buildWalls(){
         System.out.println("With brick");
     };
    void buildRoof(){
         System.out.println("With concrete");
     };
}
