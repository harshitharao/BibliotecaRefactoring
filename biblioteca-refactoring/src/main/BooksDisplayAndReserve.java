package main;


public class BooksDisplayAndReserve {
    public void reserveBook() {
        ConsoleInput input=new ConsoleInput();
        System.out.println(" Please enter the number of the book you wish to checkout: \n");

        int bookNumber =input.read();

        if(bookNumber >=1 && bookNumber <=4)
            System.out.println(" Thank You! Enjoy the book.");
        else
            System.out.println("Sorry we don't have that book yet.");
    }
    public void displayBooks() {
        System.out.println(" 1. Sweet Valley High vol. 4 by John Travolta ");
        System.out.println(" 2. eXtreme Programming Explained by Kent Beck ");
        System.out.println(" 3. How to Win Friends and Influence People by Dale Carnagie ");
        System.out.println(" 4. How to Cheat at TWU Assignements by Anonymous ");
    }
}
