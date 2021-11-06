public class Student extends Person
{
    // Private Instance members
    private String m_studentID;

    // Public properties
    public String getStudentID()
    {
        return m_studentID;
    }

    public void setStudentID(String m_studentID)
    {
        this.m_studentID = m_studentID;
    }

    public void Set(String name, int age, String studentID)
    {
        Set(name, age);
        setStudentID(studentID);
    }

    // Constructors
    // Default
    Student()
    {
        super(); // calls the super constructor
        setStudentID("000000000");
    }
    // Parameterized
    Student(String name, int age, String studentID)
    {
        super(name, age);
        setStudentID("000000000");

    }

    // Methods
    public void Studies()
    {
        System.out.println(getName() + " is Studying");
    }

    // Overloaded toString method for Student class
    @Override
    public String toString()
    {
        String outputString = super.toString();
        outputString += "StudentID: " + getStudentID() + "\n";
        return outputString;
    }
}
