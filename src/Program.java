import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner; // Import the Scanner class
/**
 * @author          Russell Waring, 100528426
 * @date            November 4, 2021
 * @description     These files have been created following along in-class of week 8.
 *
 */


public class Program
{
    // Constants
    public static final int NUM_OF_PEOPLE = 10;

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
     * This function builds an array of Person objects by instantiating NUM_OF_PEOPLE Person objects
     * @param people an array of Person objects
     */
    public static void buildPersonArray(Person[] people)
    {
        for (int i = 0; i < NUM_OF_PEOPLE; i++)
        {
            people[i] = new Person(); // array is an object of reference type
        }
    }

    public static void buildPersonArrayList(ArrayList<Person> people)
    {
        for (int i = 0; i < NUM_OF_PEOPLE; i++)
        {
            people.add(new Person());
        }
    }

    public static void buildPersonLinkedList(LinkedList<Person> people)
    {
        for (int i = 0; i < NUM_OF_PEOPLE; i++)
        {
            people.add(new Person());
        }
    }

    /**
     * The entry point for the program
     * @param args an array of command line parameters
     */
    public static void main(String[] args)
    {
        // List v ArrayList
        // ArrayList<Person> people = new ArrayList<Person>(); // creates a new empty list of Person object shape
        //buildPersonArrayList(people);

        LinkedList<Person> people = new LinkedList<Person>();
        buildPersonLinkedList(people);

        // One way of initializing custom objects: Person[] people = {new Person("Mike", 27), new Person("Chuck", 48)};
        // Person[] people = {new Person()}; // Make 'defaults' by using overloaded constructors
        // Person [] people = new Person[NUM_OF_PEOPLE]; // allocates empty spaces, but does not instantiate anything
        // buildPersonArray(people);


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
        // person.SaysHello();
        //System.out.println(person.toString()); // can use explicitly
        // System.out.println(person);

        people.set(0, person); // replaces data inside the 0th index. Works for LinkedList or ArrayList

        // System.out.println("The First Person is: " + people[0].getName());
        // System.out.println("The First Person is: " + people.get(0).getName()); // ArrayList & LinkedList
        // LinkedList contains more methods than ArrayList. Allows us to go back-and-forth.
        // ArrayList like a vector in C++.

        System.out.println(people);

        people.get(0).SaysHello(); // how to use object stored inside LinkedList or ArrayList
    }
}
