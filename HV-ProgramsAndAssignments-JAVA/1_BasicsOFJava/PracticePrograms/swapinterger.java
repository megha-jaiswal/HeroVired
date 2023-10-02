import java.util.Scanner;
//Description: Take an integer number a and b as input from the user. Using your Java skills to swap their values and print the output.
public class swapinterger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first ineteger: ");
       int a= sc.nextInt();
        System.out.println("Enter Second ineteger: ");
       int b= sc.nextInt();
       System.out.println("Numbers Before swaping: "+ a +" & "+b);
        int t=a;
        a=b;
        b=t;

    
    System.out.println("Numbers After swaping: "+ a +" & "+b);


    }
    
}
