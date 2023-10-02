package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LibraryManagement {
  static String[] books = { "Atomic Habits", "Kaizen", "The Physchology of Money" };
  static String[] availability = { "Available", "Available", "Available" };
  static int[] bookId = { 101, 102, 103 };

  static ArrayList<Integer> bookIdAL = new ArrayList<>();

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    displayMenu();
    // ArrayList<String> booksAL = new ArrayList<>(Arrays.asList(books));
    for (int i : bookId) {
      bookIdAL.add(i);
    }
    // System.out.println(bookIdAL);
    int userInput = sc.nextInt();

    switch (userInput) {
      case 1:
        displayBooks();
        break;
      case 2:
        IssueBooks();
        break;
      case 3:
      returnBooks();
      break;
      // case 4:
      // exit();
      // break;
      default:
        System.out.println("Enter a valid option from above");
    }

  }

  public static void displayMenu() {

    String textBlock = """
        ----------------------------------------------------------------------------------------------------

        Welcome to the Unique Library

        -----------------------------------------------------------------------------------------------------
        1. View the complete list of Books
        2.Issue a Book
        3.Return a Book
        4. Exit
        Please choose an option from the above menu:""";
    System.out.println(textBlock);
  }

  public static void displayBooks() {
    // for (String book : books) {
    // System.out.println(book);
    // }
    for (int i = 0; i < books.length; i++) {
      System.out.printf("%-10s %-125s %s%n", bookId[i], books[i], availability[i]);
    }
  }

  public static void IssueBooks() {
    System.out.println("Enter the book ID:");
    int userId = sc.nextInt();
    sc.nextLine();
    if (bookIdAL.contains(userId)) {
      int i = bookIdAL.indexOf(userId);
      System.out.println(bookId[i] + books[i] + availability[i]);
      System.out.println("Enter Student ID");
      String userStudentId = sc.nextLine();
      // sc.nextLine();

      System.out.println("Enter \"C\" to confirm: ");
      String confirm = sc.nextLine();

      if (confirm.equalsIgnoreCase("c")) {
        System.out.println("Book ID:" + bookIdAL.get(i) + " is issued to " + userStudentId);
      }
    } else {
      System.out.println("Enter a valid book ID");
    }

  }

public static void returnBooks() {
  System.out.println("Enter the book ID:");
    int userId = sc.nextInt();
    sc.nextLine();
    if (bookIdAL.contains(userId)) {
      int i = bookIdAL.indexOf(userId);
      System.out.println(bookId[i] + books[i]);
      System.out.println("Enter Student ID: ");
      String userStudentId = sc.nextLine();
      System.out.println("Student ID: "+ userStudentId);
      String returndate=sc.nextLine();
      int totaldays= int (returndate-issuedate);

    }

}



}
