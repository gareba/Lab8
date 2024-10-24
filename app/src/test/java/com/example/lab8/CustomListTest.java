package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList mockCityList() {
        CustomList cityList = new CustomList(null, new ArrayList<>());
        cityList.add(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }


    @Test
    void testHasCity(){
        CustomList cityList = mockCityList();

        City cityA = new City("Edmonton", "Alberta");
        City cityB = new City("Calgary", "Alberta");
        assertTrue(cityList.hasCity((cityA)));
        assertFalse(cityList.hasCity((cityB)));
    }


}
