# Lab 21 - Employee

This lab will give you practice creating classes and using inheritance.

### Instructions

1. Create a Person class. The class should contain 2 fields (both `Strings` called `firstName` and `lastName`) and the following methods:
   - `Person()`
   - `Person(String firstName, String lastName)`
   - `getFirstName()`
   - `getLastName()`
   - `setName(String firstName, String lastName)`
   - `equals(Object obj)` - Two people are equal if they have the same first and last name.
   - `toString()`


2. The class `Person` should serve as the superclass (parent class) for the class called `Employee`. This subclass (child class) should contain 3 instance variables (`payRate`, `hoursWorked`,and `department`).


3. Complete the `Employee` class.


4. Create Persons and Employees in the `Main.main` method to test your classes.

### Testing

To run the automated tests select the 'Shell' tab and enter the command `mvn test` to run the tests.
