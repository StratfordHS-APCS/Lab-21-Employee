public class Employee
{
    private double payRate;    
    private double hoursWorked;
    private String department;

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;

    // default constructor
    public Employee() 
    {

    }

    // alternate constructor that sets all 3 parameters
    public Employee(double payRate, double hoursWorked, String department)
    {

    }

    // Method to calculate and return the wages
    // handle both regular and overtime pay
    // Overtime hourly pay is OVERTIME * payRate.
    // Overtime hourly pay is only for the hours past HOURS
    public double calculatePay() 
    {

    }

    // GETTERS //

    public double getPayRate() 
    {

    }

    public double getHoursWorked() 
    {

    }

    public String getDepartment() 
    {

    }

    // SETTERS //

    public void setAll(String first, String last, double rate, double hours, String dept)
    {

    }

    // OVERRIDDEN METHODS //

    // Employees are identical if they have the same name
    // and work in the same department.
    public boolean equals(Object obj) 
    {

    }

    // should return a String like this:
    // The wages for Firstname Lastname from the _____ department are: $_____
    public String toString() 
    {

    }
}