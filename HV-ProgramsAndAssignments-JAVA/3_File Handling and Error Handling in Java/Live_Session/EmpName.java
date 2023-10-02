package LiveSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EmpName {
    public static void main(String[] args) {
//         1.Create an empty data structure to store the names of students. Prompt the user to enter the names of students. You can use a loop to repeatedly ask for names until the user indicates they are done.
// Read the input from the user and add each name to the data structure.
// After all the names have been entered, display the names of the students.
// Iterate through the data structure and print each name.
  
Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        // while (true) {
        // System.out.println("Enter the names of students");
        // String name = sc.next();
        // if (name.equals("done")) {
        // break;
        // }
        // names.add(name);
        // }
        // for (String i : names) {
        // System.out.println(i);
        // }

        // Another method
        char S;
        do {
            System.out.println("Enter the names of students");
            String name = sc.next();
            if (name.equals("done")) {
                break;
            }
            names.add(name);
            // System.out.println(names);
            System.out.println("Enter Y to Conti and N to exit the program");
            String input = sc.next();

            S = input.charAt(0);

        } while (S == 'Y' || S == 'y');
        for (String i : names) {
            System.out.println(i);
        }
   }
}

