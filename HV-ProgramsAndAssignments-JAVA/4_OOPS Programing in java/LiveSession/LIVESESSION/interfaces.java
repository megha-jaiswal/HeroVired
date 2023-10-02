public class interfaces{
        public static void main(String[] args) {
    BuildHouse cottage = new MultiStory();
    // cottage.build() ;
    }
}

public interface BuildHouse  {
    void buildBasement();
    void buildPiller();
    void buildWalls();
    void buildRoof();
   
   
}

public interface BuildMulti extends BuildHouse  {
    void buildParking();
   
   
}
public class Cottage implements  BuildMulti,BuildHouse {
    //  void buildBasement(){
    //      System.out.println("With mud");
    //  };
    // void buildPiller(){
    //       System.out.println("With Wood");
    // }
    void buildWalls(){
         System.out.println("With Bamboo");
     };
    // void buildRoof(){
    //      System.out.println("With Hay");
    //  };
    
}

public class MultiStory implements BuildHouse {
     void buildBasement(){
         System.out.println("With concrete");
     }
    void buildPiller(){
           System.out.println("With iron rod");
    }
    void buildWalls(){
         System.out.println("With brick");
     }
    void buildRoof(){
         System.out.println("With concrete");
     }
}
