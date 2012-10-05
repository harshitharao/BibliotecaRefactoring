package main;

public class CheckLibraryNumberCommand implements Command{
    @Override
    public void execute()
    {
        new Action().checkLibraryNumber();
    }
}
