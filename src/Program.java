/**
 * @author          Russell Waring, 100528426
 * @date            November 4, 2021
 * @description     These files have been created following along in-class of week 8.
 *
 */

import java.util.Scanner; // Import the Scanner class

public class Program
{
    /**
     * This function returns the squared value of a given value.
     * @param value a floating point number to be squared
     * @return returns the square of the given value
     */
    public static float square(float value)
    {
        return value * value;
    }

    /**
     * The entry point for the program
     * @param args an array of command line parameters
     */
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

        float valueToSquare = 5;
        float squaredValue = square(valueToSquare);

        // example of output
        System.out.println("The Squared Value is: " + squaredValue);

        // Step 1. for input we need to create a Scanner object
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Enter your name: "); // print is like a newline
        // Step 2. use the Scanner object to get the "next" line of data in this case a String value
        String name = inputObject.nextLine();

        System.out.print("Enter your age: ");
        int age = inputObject.nextInt(); // converts from string, to input, to int

        Person person = new Person(name, age); // using name value
        person.SaysHello();
    }
}
