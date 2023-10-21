import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int [] uarr = arr(); 
    }
    
    public static int[] arr(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Comma seperated Value: ");
        String num = sc.nextLine();
        String [] userArr= num.split(",");
        int [] numarray = new int[userArr.length];
        for (int i=0; i< userArr.length; i++){
            numarray[i]= Integer.parseInt(userArr[i]);
            }
            System.out.println(Arrays.toString (numarray));
            return numarray;
    }

public static 

}
