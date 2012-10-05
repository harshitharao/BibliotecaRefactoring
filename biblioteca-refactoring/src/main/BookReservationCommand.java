package main;


public class BookReservationCommand implements Command{
    @Override
    public void execute()
    {
        new BooksDisplayAndReserve().reserveBook();
    }
}
