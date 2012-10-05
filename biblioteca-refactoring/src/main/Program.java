package main;

public class Program {


    public static void main(String[] args) {
        Action action=new Action();
        action.displayMenu();
        ConsoleInput input=new ConsoleInput();
        while (true) {

            int menuindex=input.read();
            action.takeAction(menuindex);
            if(menuindex==9) break;
        }
    }
}
