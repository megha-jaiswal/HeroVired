import java.util.Arrays;
import java.util.Random;

public class minMaxAvg {
    public static void main(String[] args) {
        int [] arr = randomarray(3);
        System.out.println(Arrays.toString(arr)); 

    // for min
     System.out.println("min value is: "+ min(arr));
    // for max
    System.out.println("Max value is: "+ max(arr));
        // for average
        int sum= 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Average of array no is:" + (sum / arr.length));
    }
 public static int [] randomarray(int len) {
    Random r= new Random ();
    int [] numArray = new int[len];
    for (int i = 0; i<len; i++){
        numArray[i] = r.nextInt(100);
    }
    return numArray;    
 }
public static int min(int [] a){

int j = Integer.MAX_VALUE;
    for (int i=0; i<a.length; i++){
        if (a[i] < j){
            j= a[i];
           
        }
           }
    return j;
}

public static int max(int [] a){

int j = 0;
    for (int i=0; i<a.length; i++){
        if (a[i] > j){
            j= a[i];
           
        }
           }
    return j;
}

}
