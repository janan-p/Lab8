package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> cities;
    private CustomList list;

    /**
     * Get the number of cities in the list
     * @return Number of cities in the list
     */
    public int getCount() {
        return cities.size();
    }

    /**
     * Add a city to the list
     * @param city City to add
     */
    public void addCity(City city) {
        cities.add(city);
    }

    /**
     * Create a mocklist
     * @return Mocklist
     */
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }


}
