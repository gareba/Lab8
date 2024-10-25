package com.example.lab8;

public class City {

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }
    /**
     * Overrides the equals function to use city attributes for comparison.
     * @param o
     * Other object of comparison
     * @return
     * True if the city and province names match
     * False otherwise
     */
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        City city = (City) o;
        return this.getProvinceName() == city.getProvinceName() && this.getCityName() == city.getCityName();
    }

}
