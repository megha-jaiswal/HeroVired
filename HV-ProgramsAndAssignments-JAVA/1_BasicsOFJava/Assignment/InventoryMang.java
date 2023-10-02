import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;

public class InventoryMang {
    static String [] products ={" Mobile", "Laptop", "Tablet", "Smart Watch", "Digital Camera"};
    static int [] productId = {101,102,103,104,105};
    static int [] count = {10,20,30,40,15};
    static String [] specification= {"Dual Sim, 3G, 4G, VoLTE, Wi-Fi,2 GHz Processor, 4 GB RAM, 64 GB inbuilt,5000 mAh Battery, 6.52 inches, 720 x 1600 px Display with Water Drop Notch ",
    "IntelCore i5 9 Gen · QuadCore, 2.4 GHz Clock Speed · 8 GB RAM · 512 GB SSD · 4 GB NVIDIA Graphics Card ", 
    "Display 8.00-inch (1024x768), Processor 1.2GHz quad-core, Front Camera 2MP · RAM 2GB · OS Android 5.0 ", 
    "Compatibility - ios and Android | Water Resistance | Battery Life - 2days | GPS, fitness tracking, sleep monitoring, step counting, and more",
    "Digital Camera, Sentor type=CMOS, Display type-TFT LCD, battery type-Lithium ion, Touch screen-Yes"};
    static String [] modifySpec ={};
    static int [] modifyInventory ={};
    static String exit;
    static Scanner sc= new Scanner(System.in);
    static String c1;
    public static void main(String[] args) {
       do { 
        System.out.println("-----------------------------------------------");
        System.out.println("Welcome to the SmartPoint Electronics Store");
        System.out.println("-----------------------------------------------");
        System.out.println("1. View the complete list of our products");
        System.out.println("2. Check the available count for a specific product");
        System.out.println("3. View the specifications and details of a specific product");
        System.out.println("4. Modify the details of a specific product");
        System.out.println("5. Update the inventory for a specific product");
        System.out.println("6. Exit"+"\n");
        System.out.println();
        System.out.println("Please choose an option from the above menu:");
        int input= sc.nextInt();
        sc.nextLine();

        
        switch(input){
            case 1: 
            productList(); 
            break;

            case 2:
            productCount();
            break;

            case 3:
            specification();
            break;

            case 4:
            modifySpec();
            break;

            case 5:
            modifyInventory();
            break;

            case 6:
            exit();
            break;
        }
        System.out.println("\n"+"Enter Y to return to the main menu or N to Exit: "+"\n");
        System.out.println("--------------------------------------");
        c1 = sc.nextLine();
       
    } while (c1.equalsIgnoreCase("y")); 
    
    exit();

    

   }

      public static void productList(){
        System.out.println("--------------------------------------");
        System.out.println("List of all products ");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("Product ID      Product Name");
        System.out.println();
        for (int i =0; i< productId.length; i++ ){
            System.out.printf("%-15s %s %n", productId[i] ,products[i]+"\n");
            //System.out.println("--------------------------------------");
            
        }
        
    }
    

    public static void productCount(){
        System.out.println("Enter the Product ID ");
        int IdNum = sc.nextInt();
        sc.nextLine();
        System.out.println("-------------------------------");
        
        for (int i=0; i< productId.length; i++){
            if (IdNum == productId[i]){
                 System.out.printf("%-10s %s %n", productId[i] ,products[i]+"\n");
                 System.out.println("Total available count:"+ count[i]+"\n");
                 System.out.println("-------------------------------");
            }
        }

    }

    public static void specification(){
        //System.out.println("View the specifications and details of a product"+"\n");
        System.out.println("-------------------------------");
        System.out.println("Enter the Product ID ");
        int IdNum = sc.nextInt();
        sc.nextLine();
        System.out.println("-------------------------------");
        for (int i=0; i< productId.length; i++){
            if (IdNum == productId[i]){
                System.out.printf("%-15s %s %n", productId[i] ,products[i]+ "\n");
                System.out.println("Total available count:"+ count[i]+"\n");
                System.out.println("Specification :"+ specification[i]+"\n");
                System.out.println("-------------------------------");
                break;
        } 
                    
        }}

    public static void modifySpec(){
        System.out.println("Enter the Product ID to modify ");
        int mId = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.println("-------------------------------");
        for (int i=0; i< productId.length; i++){
        if (mId == productId[i]){
        System.out.printf("%-10s %s %n", productId[i] ,products[i]+"\n");        
        System.out.println(" Current Specification :"+ specification[i]+"\n");        
        System.out.println("Add the sepcifiaction to be add: "+"\n");
        String newSpec= sc.nextLine();        
        System.out.println(" New Specification: "+specification[i]+" "+newSpec+"\n");
        System.out.println("-------------------------------");
        break;
    }
    }
    }

    public static void modifyInventory(){
        //System.out.println("Update the inventory for a specific product"+"\n");
        System.out.println("Enter the Product ID "+"\n");
        int IdNum = sc.nextInt();
        sc.nextLine();
        System.out.println("\n"+"1.Add Quantities:"+"\n");
        System.out.println("2.Subtract Quantities"+"\n");
        System.out.println("Please choose an option from the above menu: ");
        int choice = sc.nextInt();
        
        if (choice==1) {
        for (int i=0; i< productId.length; i++){
            if (IdNum == productId[i]){
                System.out.println("Current available inventory for "+productId[i]+"-"+products[i]+":"+ count[i]+"\n");
                System.out.println("Please enter the count to be added:"+"\n");
                int newCount= sc.nextInt();
                sc.nextLine();
                System.out.println("-------------------------------");
                int newCount1 = newCount+count[i];
                System.out.printf("%-15s %s %n", productId[i] ,products[i]+"\n");
                System.out.println("Total available count:"+ newCount1+"\n"); 
                //break;
    
            } 
        }}
            else {
                for (int i=0; i< productId.length; i++){
                    if (IdNum == productId[i]){
                        System.out.println("Current available inventory for "+productId[i]+products[i]+":"+ count[i]+"\n");
                        System.out.println("Please enter the count to be subtract:"+"\n");
                        int newCount= sc.nextInt();
                        sc.nextLine();
                        System.out.println("-------------------------------");
                        int newCount1 = count[i]-newCount;
                        System.out.printf("%-15s %s %n", productId[i] ,products[i]+"\n");
                        System.out.println("Total available count:"+ newCount1+"\n");
                        break;
                        
            }
        }
    }
}

    public static void exit(){
        System.out.println("Thank you for visiting SmartPoint!"+"\n");
        //break;
        
    }
    
}
