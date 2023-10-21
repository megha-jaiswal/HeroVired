package Assignment;
import java.util.Scanner;
//Description: Take an integer number N as input from the user and print multiplication table as shown below - 

public class AssignmentTable {
    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no to calculate table: ");
        int N = sc.nextInt();
        for (int i=1; i<=10; i++){
        //int table = num * i;
        System.out.println(N +" x " + i +"="+ N*i);
        }
        
 }
    
}
