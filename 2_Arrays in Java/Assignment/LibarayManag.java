package libraryManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class LibarayManag {
static String [] books={"Atomic Habits","Kaizen", "The Physchology of Money"};
static int [] bookId= {101,102,103};
static String[] availability= {"Available","Available","Available"};
static ArrayList<String> booksAL = new ArrayList<>(Arrays.asList(books));


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("-----------------------------------------------------------------------------");
System.out.println("Welcome to the Unique Library "+"\n"); 
System.out.println("-----------------------------------------------------------------------------");

System.out.println("1. View the complete list of Books"); 

System.out.println("2.Issue a Book"); 

System.out.println("3. Return a Book"); 

System.out.println("4. Exit"); 

System.out.println("Please choose an option from the above menu:"); 

int option = sc.nextInt();

switch (option){

    case 1:
    ListOfBooks();

//     case 2:
//     IssueABook();

//     case 3:
//     ReturnABook();

//     case 4:
//     exit();

 }
System.out.println(booksAL);
 
case 1

}
   
}
