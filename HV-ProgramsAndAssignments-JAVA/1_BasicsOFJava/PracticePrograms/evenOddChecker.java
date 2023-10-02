import java.util.Scanner;

public class evenOddChecker {
    
//Description: Create a menu driven command-line based application in Java to take an integer number N as input from the user and display if the given number is an Even Number or the Odd Number.

   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
    do{
        if ((a % 2)==0)
        System.out.println("Enter no is even no");
        else
        System.out.println("Enterd no is odd no");
         break;
        }while (true);
        
        //    System.out.println("Do you want to continue");
        //     String choice =sc.nextLine();
}
}
