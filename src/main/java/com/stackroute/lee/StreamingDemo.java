package main.java.com.stackroute.lee;

import java.util.ArrayList;
import java.util.stream.Collectors;

/*
Returns all the names that starts with A.
Returns all the names in uppercase.
Returns all the names in uppercase whose name ends with S.
Counts all the names that ends with h.
Returns firstname that starts with "S".
Returns all the numbers which are even.
 */

public class StreamingDemo {

    public static ArrayList<String> getNamesThatStartsWithA(ArrayList<String> memberList) {
        ArrayList<String> resultList = new ArrayList<>();
        resultList = (ArrayList<String>) memberList.stream().filter(p -> p.startsWith("A")).collect(Collectors.toList());
        return resultList;
    }

    public static ArrayList<String> getUpperCaseNames(ArrayList<String> memberList) {
        ArrayList<String> resultList = new ArrayList<>();
        memberList.forEach(p -> {
            resultList.add(p.toUpperCase());
        });
        return resultList;
    }

    public static ArrayList<String> getUpperCaseNamesWhoseNamesEndsWithS(ArrayList<String> memberList) {
        ArrayList<String> upperCaseList = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();
        memberList.forEach(p -> {
            upperCaseList.add(p.toUpperCase());
        });
        resultList = (ArrayList<String>) upperCaseList.stream().filter(p -> p.endsWith("S")).collect(Collectors.toList());
        return resultList;
    }

    public static int countNamesThatEndsWithh(ArrayList<String> memberList) {
        ArrayList<String> resultList = new ArrayList<>();
        resultList = (ArrayList<String>) memberList.stream().filter(p -> p.endsWith("h")).collect(Collectors.toList());
        return resultList.size();
    }

    public static String getFirstNameThatStartsWithS(ArrayList<String> memberList) {
        ArrayList<String> resultList = new ArrayList<>();
        resultList = (ArrayList<String>) memberList.stream().filter(p -> p.startsWith("S")).collect(Collectors.toList());
        return resultList.get(0);
    }

    public static ArrayList<Integer> getNumbersThatAreEven(ArrayList<Integer> memberList) {
        ArrayList<Integer> resultList = new ArrayList<>();
        memberList.forEach(p -> {
            if(p%2 == 0) {
                resultList.add(p);
            }
        });
        return resultList;
    }
}
