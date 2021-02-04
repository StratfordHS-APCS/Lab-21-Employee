import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class Tests 
{
    @Test
    public void testPersonFirstName() 
    {
        Person p = new Person("James", "Bond");
        assertEquals("Error getting first name", "James", p.getFirstName());
    }

    @Test
    public void testPersonLastName() 
    {
        Person p = new Person("James", "Bond");
        assertEquals("Error getting last name", "Bond", p.getLastName());
    }

    @Test
    public void testPersonSetFirstName() 
    {
        Person p = new Person();
        p.setFirstName("James");
        assertEquals("Error setting first name", "James", p.getFirstName());
    }

    @Test
    public void testPersonSetLastName() 
    {
        Person p = new Person();
        p.setLastName("Bond");
        assertEquals("Error setting last name", "Bond", p.getLastName());
    }

    @Test
    public void testPersonEqual() 
    {
        Person p1 = new Person("James", "Bond");
        Person p2 = new Person("James", "Bond");
        Person p3 = new Person("Jimmy", "Bond");
        assertTrue("Error in equals method", p1.equals(p2));
        assertFalse("Error in equals method", p1.equals(p3));
    }

    @Test
    public void testPersonToString()
    {
        Person p = new Person("James", "Bond");
        assertTrue("toString doesn't return anything", p.toString().length > 0);
    }

    @Test
    public void testEmployeeConstructor()
    {
        Employee e = new Employee(10.0, 40, "Science");
        assertEquals("Error creating a new Employee", 10.0, e.getPayRate());
        assertEquals("Error creating a new Employee", 40, e.getHoursWorked());
        assertEquals("Error creating a new Employee", "Science", e.getDepartment());
    }

    @Test
    public void testEmployeePay()
    {
        Employee e = new Employee(10.0, 40, "Science");
        Employee e2 = new Employee(10.0, 41, "Science");
        assertEquals("Error with standard Employee pay.", 400.0, e.calculatePay());
        assertEquals("Error with overtime Employee pay.", 415.0, e2.calculatePay());
    }

    @Test
    public void testSetAll()
    {
        Employee e = new Employee();
        e.setAll("James", "Bond", 15.0, 40, "Science");
        assertEquals("Error with setAll().", "James", e.getFirstName());
        assertEquals("Error with setAll().", "Bond", e.getLastName());
        assertEquals("Error with setAll().", 15.0, e.getPayRate());
        assertEquals("Error with setAll().", 40, e.getHoursWorked());
        assertEquals("Error with setAll().", "Science", e.getDepartment());
    }

    @Test
    public void testEmployeeEqual() 
    {
        Employee p1 = new Employee("James", "Bond");
        Employee p2 = new Employee("James", "Bond");
        Employee p3 = new Employee("Jimmy", "Bond");
        assertTrue("Error in equals method", p1.equals(p2));
        assertFalse("Error in equals method", p1.equals(p3));
    }

    @Test
    public void testEmployeeToString()
    {
        Employee p = new Employee("James", "Bond");
        assertTrue("toString doesn't return anything", p.toString().length > 0);
    }

     Employee(double payRate, double hoursWorked, String department)
     double calculatePay() 
     double getPayRate()
     double getHoursWorked()
     String getDepartment() 
     void setAll(String first, String last, double rate, double hours, String dept)
     boolean equals(Object obj) 
     String toString()
    
}