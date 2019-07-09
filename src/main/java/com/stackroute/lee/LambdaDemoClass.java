package main.java.com.stackroute.lee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Sorts list by lastname and returns all employees whose lastname starts with "C".
 */

public class LambdaDemoClass {

    public static ArrayList<Employee> sortListWithLastName(ArrayList<Employee> employeeList) {
        Comparator<Employee> employeeNameComparator
                = Comparator.comparing(
                Employee::getLastName);
        employeeList.sort(employeeNameComparator);
        return employeeList;
    }

    public static ArrayList<Employee> sortListC(ArrayList<Employee> employeeList) {
        ArrayList<Employee> resultList = new ArrayList<>();
        employeeList.forEach(employee -> {
            if(employee.getLastName().startsWith("C")) {
                resultList.add(employee);
            }
        });
        return resultList;
    }
}
