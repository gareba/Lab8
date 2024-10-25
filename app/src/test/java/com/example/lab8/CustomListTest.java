package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

public class CustomListTest {
    private CustomList mockCityList() {
        CustomList cityList = new CustomList(null, new ArrayList<City>());
        cityList.addCity(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    public void addCityTest(){
        CustomList list = mockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testHasCity(){
        CustomList cityList = mockCityList();

        City cityA = new City("Edmonton", "Alberta");
        City cityB = new City("Calgary", "Alberta");
        assertTrue(cityList.hasCity((cityA)));
        assertFalse(cityList.hasCity((cityB)));
    }

    @Test
    void testDeleteCity(){
        CustomList cityList = mockCityList();

        City cityA = new City("Edmonton", "Alberta");
        City cityB = new City("Calgary", "Alberta");

        assertTrue(cityList.hasCity(cityA));
        cityList.delete(cityA);
        assertFalse(cityList.hasCity(cityA));

        assertThrows(IllegalArgumentException.class, () -> cityList.delete(cityB));
    }

    @Test
    void testCountCities(){
        CustomList cityList = mockCityList();
        assertEquals(1, cityList.countCities());

        City cityA = new City("Edmonton", "Alberta");


        City cityB = new City("Calgary", "Alberta");


        cityList.addCity(cityB);

        assertEquals(2, cityList.countCities());

        cityList.delete(cityA);
        assertEquals(1, cityList.countCities());


    }



}
