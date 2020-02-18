package za.ac.cput.groupb;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static App app = new App();
    private static String name;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        intro();
        System.out.print( "What's your name?: " );
        app.setName(name);
        System.out.println("Hi " + app.getName());
        System.out.println("Hi Bob");
    }

    public static String intro() {
        return "Meet bob";
    }

    public void setName(String inputName) {
        name = inputName;
    }

    public String getName() {
        return name;
    }
}
