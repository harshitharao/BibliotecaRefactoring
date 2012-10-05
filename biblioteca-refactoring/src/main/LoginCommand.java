package main;


public class LoginCommand implements Command{
    @Override
    public void execute()
    {
        new Program().login();
    }
}
