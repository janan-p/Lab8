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
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    public void hasCity() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        assertEquals(false, list.hasCity(city));
        list.addCity(new City("Estevan", "SK"));
        assertEquals(true, list.hasCity(city));
    }

}
