package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;

public class CityMap {
    public static void main(String[] args)
    {
        HashMap<String, ArrayList<String>> distributedСities = new HashMap<>();
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(new City("Moscow", "Russia"));
        cityList.add(new City("Magadan", "Russia"));
        cityList.add(new City("Washington", "USA"));
        cityList.add(new City("Berlin", "Germany"));
        cityList.add(new City("Chicago", "USA"));
        cityList.add(new City("Madrid", "Spain"));

        ArrayList<String> countries = new ArrayList<>();
        for(City cityObj : cityList)
        {
            if(!countries.contains(cityObj.getCountry()))
            {
                countries.add(cityObj.getCountry());
            }
        }

        ArrayList <ArrayList<String>> finalList = new ArrayList<>();
        for(String country : countries)
        {
            ArrayList<String> cityListForSpecificCountry = new ArrayList<>();
            for(City cityObj : cityList) {
                if(cityObj.getCountry() == country)
                {
                    cityListForSpecificCountry.add(cityObj.getCity());
                }
            }
            finalList.add(cityListForSpecificCountry);
        }

        for(int i = 0; i < countries.size(); i++)
        {
            distributedСities.put(countries.get(i), finalList.get(i));
        }

        System.out.println(distributedСities);
    }
}
