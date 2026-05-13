// Java program showing the working of abstraction

// Importing generic libraries
import java.io.*;

// Creating an abstract class
// demonstrate abstraction
abstract class Creature {

    // Just providing that creatures has legs
    // Hiding the number of legs
    abstract void No_Of_legs();
}

// A new child class is extending
// the parent abstract class above
class Elephant extends Creature {

    // Implementation of the abstract method
    void No_Of_legs()
    {

        // Printing message of function in non abstract
        // child class
        System.out.println("It has four legs");
    }
}

// Again a new child class is extended from parent
//  Human class to override function created above
class Human extends Creature {

    // Same function over-riden
    public void No_Of_legs()
    {

        // Message printed if this function is called or
        // Implementation of the abstract method
        System.out.println("It has two legs");
    }
}

public class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating human object showing the implementation
        Human ob = new Human();

        ob.No_Of_legs();

        // Creating object of above class in  main
        Elephant ob1 = new Elephant();

        // Calling the function in main by
        // creating object of above non abstract class
        ob1.No_Of_legs();
        // Implementation of abstraction
    }
}