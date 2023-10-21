package Assignment;
//Description: WAP in Java to take the total marks and the marks obtained by a Student. Then using your programming skills calculate the percentage obtained by a student along with the GPA.
import java.util.Scanner;
//String java.util.Scanner.nextLine()
public class CalPercentage{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Total marks: ");
        int TMarks= sc.nextInt();
        System.out.print("Enter marks Obtained: ");
        int OMarks= sc.nextInt();
        Float per= (float) ((OMarks*100)/TMarks);
        System.out.println("Percentage: " + per+"%");
        if (per <=59){           
            System.out.print("Grade F, GPA = 0.0");
        } else if (per >=60 && per <=69){
            System.out.print("Grade D, GPA = 1.0");
        }
        else if ((per >=70) && (per <=79)){
            System.out.print("Grade C, GPA = 2.0");
        }

        else if ((per >=80) && (per <=89)){
            System.out.print("Grade B, GPA = 3.0");
        }
        else if ((per >=90) && (per <=100)){
            System.out.print("Grade A, GPA = 4.0");
        }
          
    }
    

}
