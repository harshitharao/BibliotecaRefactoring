package main;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleInput {
    InputStreamReader inputStream = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(inputStream);
    public  int read()
    {   int number=0;
        try {
            String value = reader.readLine();
            number = Integer.parseInt(value);
        } catch (Exception e) {

            System.out.println("Enter a valid integer!!");
        }
        return number;
    }
}
