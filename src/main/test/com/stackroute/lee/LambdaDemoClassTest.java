package main.test.com.stackroute.lee;

import main.java.com.stackroute.lee.Employee;
import main.java.com.stackroute.lee.LambdaDemoClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LambdaDemoClassTest {

    LambdaDemoClass lambdaDemoClass;

    @Before
    public void setUp() throws Exception {
        lambdaDemoClass = new LambdaDemoClass();
    }

    @Test
    public void givenEmployeeObjectsReturnsLastNameSortedList() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(23, "MNO", "PQR"));
        employeeList.add(new Employee(22, "DEF", "GHI"));
        employeeList.add(new Employee(20, "ABC", "DEF"));
        employeeList.add(new Employee(21, "JKL", "MNO"));
        ArrayList<Employee> actualList = new ArrayList<>();
        actualList = lambdaDemoClass.sortListWithLastName(employeeList);
        ArrayList<Employee> expectedList = new ArrayList<>();
        expectedList.add(new Employee(20, "ABC", "DEF"));
        expectedList.add(new Employee(22, "DEF", "GHI"));
        expectedList.add(new Employee(21, "JKL", "MNO"));
        expectedList.add(new Employee(23, "MNO", "PQR"));
        assertEquals(expectedList.toString(), actualList.toString());
    }

    @Test
    public void givenEmployeeObjectsReturnsLastNameWithC() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(23, "MNO", "CBA"));
        employeeList.add(new Employee(22, "DEF", "GHI"));
        employeeList.add(new Employee(20, "ABC", "CDE"));
        employeeList.add(new Employee(21, "JKL", "MNO"));
        ArrayList<Employee> actualList = new ArrayList<>();
        actualList = lambdaDemoClass.sortListC(employeeList);
        ArrayList<Employee> expectedList = new ArrayList<>();
        expectedList.add(new Employee(23, "MNO", "CBA"));
        expectedList.add(new Employee(20, "ABC", "CDE"));
        assertEquals(expectedList.toString(), actualList.toString());
    }

    @Test
    public void givenNullReturnsNull() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        ArrayList<Employee> actualList = new ArrayList<>();
        actualList = lambdaDemoClass.sortListWithLastName(employeeList);
        ArrayList<Employee> expectedList = new ArrayList<>();
        assertEquals(expectedList.toString(), actualList.toString());
    }

    @After
    public void tearDown() throws Exception {
        lambdaDemoClass = null;
    }
}