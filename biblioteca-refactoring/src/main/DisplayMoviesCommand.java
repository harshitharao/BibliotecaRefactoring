package main;

public class DisplayMoviesCommand implements Command{
    @Override
    public void execute()
    {
        new Movie().displayMovies();
    }
}
