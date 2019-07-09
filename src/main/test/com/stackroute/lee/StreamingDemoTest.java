package main.test.com.stackroute.lee;

import main.java.com.stackroute.lee.StreamingDemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StreamingDemoTest {

    private StreamingDemo streamingDemo;
    private ArrayList<String> memberNames;
    private List<String> actualList;
    private List<String> expectedList;

    @Before
    public void setUp() throws Exception {
        streamingDemo = new StreamingDemo();
    }

    @Test
    public void givenListReturnsListWithNamesStartingWithA() {
        memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokes");
        actualList = new ArrayList<>();
        actualList = streamingDemo.getNamesThatStartsWithA(memberNames);
        expectedList = new ArrayList<>();
        expectedList.add("Amitabh");
        expectedList.add("Aman");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void givenListReturnsListWithUpperCaseNames() {
        memberNames = new ArrayList<>();
        memberNames.add("AMITABH");
        memberNames.add("SHEKHAR");
        memberNames.add("AMAN");
        memberNames.add("AHANA");
        memberNames.add("SHAHRUKH");
        memberNames.add("SALMAN");
        memberNames.add("YANA");
        memberNames.add("LOKES");
        actualList = new ArrayList<>();
        actualList = streamingDemo.getUpperCaseNames(memberNames);
        expectedList = new ArrayList<>();
        expectedList.add("AMITABH");
        expectedList.add("SHEKHAR");
        expectedList.add("AMAN");
        expectedList.add("AHANA");
        expectedList.add("SHAHRUKH");
        expectedList.add("SALMAN");
        expectedList.add("YANA");
        expectedList.add("LOKES");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void givenListReturnsListWithUpperCaseNamesThatEndsWithS() {
        memberNames = new ArrayList<>();
        memberNames.add("AMITABH");
        memberNames.add("SHEKHAR");
        memberNames.add("AMAN");
        memberNames.add("AHANA");
        memberNames.add("SHAHRUKH");
        memberNames.add("SALMAN");
        memberNames.add("YANA");
        memberNames.add("LOKES");
        actualList = new ArrayList<>();
        actualList = streamingDemo.getUpperCaseNamesWhoseNamesEndsWithS(memberNames);
        expectedList = new ArrayList<>();
        expectedList.add("LOKES");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void givenListReturnsListWithNamesEndsWithh() {
        memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokes");
        int actualInteger;
        actualInteger = streamingDemo.countNamesThatEndsWithh(memberNames);
        assertEquals(2, actualInteger);
    }

    @Test
    public void givenListReturnsListWithNamesStartsWithS() {
        memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokes");
        String actualString;
        actualString = streamingDemo.getFirstNameThatStartsWithS(memberNames);
        assertEquals("Shekhar", actualString);
    }

    @Test
    public void givenListReturnsListWithNumbersWhichAreEven() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        ArrayList<Integer> actualList = new ArrayList<>();
        actualList = streamingDemo.getNumbersThatAreEven(numbers);
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        assertEquals(expectedList, actualList);
    }

    @After
    public void tearDown() throws Exception {
        streamingDemo = null;
    }
}