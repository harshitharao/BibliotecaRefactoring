package main;


public class DisplayBooksCommand implements Command{
    BooksDisplayAndReserve obj=new BooksDisplayAndReserve();

    @Override
    public void execute()
    {
        obj.displayBooks();
    }
}
