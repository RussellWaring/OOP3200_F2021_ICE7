/**
 * @author      Russell Waring
 * @studentID   100528426
 * @date        November 4, 2021
 * @desc        These files have been created following along in-class of week 8.
 *
 */

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

    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

        float valueToSquare = 5;
        float squaredValue = square(valueToSquare);

        System.out.println("The Squared Value is: " + squaredValue);

        Person person = new Person("Tom", 30);
        person.SaysHello();
    }
}
