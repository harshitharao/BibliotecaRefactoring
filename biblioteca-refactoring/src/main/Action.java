package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Action {
    private static boolean loggedIn = false;
    private static String savedLibraryNumber = "";

    private List<Command> menuActions=new ArrayList<Command>();

    public Action()
    {
        addMenuActions();
    }

     private void addMenuActions() {

        menuActions.add(new DisplayBooksCommand());
        menuActions.add(new BookReservationCommand());
        menuActions.add(new CheckLibraryNumberCommand());
        menuActions.add(new DisplayMoviesCommand());
        menuActions.add(new LoginCommand());

    }

    public void takeAction(int option) {
        if(option>=1 && option<=5){
            Command command=menuActions.get(option-1);
            command.execute();
       }
        if(option==9)
           new ExitCommand().execute();
        else
        {System.out.println("Select a valid option!!");
        return;
        }
    }


    public void displayMenu() {
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


    private static boolean loggedIn() {
        return loggedIn;
    }
    private static boolean validPassword(String password) {
        return "bhaisahab".equals(password);
    }

    private static boolean validLibraryNumber(String libraryNumber) {
        return libraryNumber.matches("\\d\\d\\d-\\d\\d\\d\\d");
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