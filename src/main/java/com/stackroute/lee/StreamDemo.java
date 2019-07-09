package main.java.com.stackroute.lee;

import java.util.ArrayList;

/*
Returns all the places from Nepal present in the list.
 */

public class StreamDemo {

    public static ArrayList<String> printPlacesFromList(ArrayList<String> placesList) {
        ArrayList<String> resultList = new ArrayList<>();
        placesList.forEach(p -> {
            String[] splitList = p.split(", ");
            if(splitList[0].equals("Nepal")) {
                resultList.add(splitList[1]);
            }
        });
        return resultList;
    }
}
