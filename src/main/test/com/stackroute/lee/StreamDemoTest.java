package main.test.com.stackroute.lee;

import main.java.com.stackroute.lee.StreamDemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class StreamDemoTest {

    private StreamDemo streamDemo;

    @Before
    public void setUp() throws Exception {
        streamDemo = new StreamDemo();
    }

    @Test
    public void givenStatesPlacesListReturnsPlaces() {
        ArrayList<String> places = new ArrayList<>();
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");
        ArrayList<String> actualPlacesList = new ArrayList<>();
        actualPlacesList = streamDemo.printPlacesFromList(places);
        ArrayList<String> expectedPlacesList = new ArrayList<>();
        expectedPlacesList.add("Kathmandu");
        expectedPlacesList.add("Pokhara");
        assertEquals(expectedPlacesList, actualPlacesList);
    }

    @Test
    public void givenStatesPlacesListWithoutNepalReturnsNullList() {
        ArrayList<String> places = new ArrayList<>();
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");
        ArrayList<String> actualPlacesList = new ArrayList<>();
        actualPlacesList = streamDemo.printPlacesFromList(places);
        ArrayList<String> expectedPlacesList = new ArrayList<>();
        assertEquals(expectedPlacesList, actualPlacesList);
    }

    @Test
    public void givenNullListReturnsNullList() {
        ArrayList<String> places = new ArrayList<>();
        ArrayList<String> actualPlacesList = new ArrayList<>();
        actualPlacesList = streamDemo.printPlacesFromList(places);
        ArrayList<String> expectedPlacesList = new ArrayList<>();
        assertEquals(expectedPlacesList, actualPlacesList);
    }

    @After
    public void tearDown() throws Exception {
        streamDemo = null;
    }
}