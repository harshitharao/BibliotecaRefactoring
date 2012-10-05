package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {
    private static boolean loggedIn = false;
    private static String savedLibraryNumber = "";

    public static void main(String[] args) {
        while (true) {
            displayMenu();

            InputStreamReader inputStream = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStream);
            int menuindex = 0;
            menuindex=new ConsoleInput().read();

            if (menuindex == 1) {
                new BooksDisplayAndReserve().displayBooks();
            } else if (menuindex == 2)
                new BooksDisplayAndReserve().reserveBook();

            else if (menuindex == 3)
                   new Program().checkLibraryNumber();
                else if (menuindex == 4) {
                new Movie().displayMovies();
            } else if (menuindex == 5) {
                 new Program().login();

            } else if (menuindex == 9) {
                System.out.println("Quitting...");
                break;
            } else {

                System.out.println("\nEnter a valid integer!!");
            }
        }
    }



    private static void displayMenu() {
        System.out.println("**********************************************************");
        System.out.println("* Welcome to The Bangalore Public Library System - Biblioteca *");
        System.out.println("**********************************************************");
        System.out.println("*                Menu                                    *");
        System.out.println("*         =====================                          *");
        System.out.println("*         1. List Book Catalog                           *");
        System.out.println("*         2. Check out Book                              *");
        System.out.println("*         3. Check Library Number                        *");
        System.out.println("*         4. Movie Listing                               *");
        System.out.println("*         5. Login                                       *");
        System.out.println("*         9. Exit                                        *");
        System.out.println("**********************************************************");
        System.out.println("Your Selection: ");
    }

    private static boolean validPassword(String password) {
        return "bhaisahab".equals(password);
    }

    private static boolean validLibraryNumber(String libraryNumber) {
        return libraryNumber.matches("\\d\\d\\d-\\d\\d\\d\\d");
    }

    private static boolean loggedIn() {
        return loggedIn;
    }


    private static void clearLogin() {
        loggedIn = false;
        savedLibraryNumber = "";
    }
    public void checkLibraryNumber() {
        if (loggedIn()) {

            System.out.println("\nYour library number is " + savedLibraryNumber);
        } else {
            System.out.println("\nPlease talk to Librarian. Thank you.");
        }
    }
    public void login() {
        clearLogin();
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader reader=new BufferedReader(inputStream);
        System.out.println("Enter your library number");
        try {
            String libraryNumber = reader.readLine();
            if (validLibraryNumber(libraryNumber)) {
                try {
                    System.out.println("Enter your Password: ");
                    String password = reader.readLine();
                    if (validPassword(password)) {
                        loggedIn = true;
                        savedLibraryNumber = libraryNumber;
                    }
                } catch (Exception e) {

                }
            }
        } catch (Exception e) {

        }
    }

  }

