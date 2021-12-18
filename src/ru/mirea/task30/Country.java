package ru.mirea.task30;

import java.util.*;

public class Country {
    private int id;
    private String name;
    private double population; //mln
    private String capital;
    private WorldParts worldPart;

    private static Map<Integer, Country> allCountries = new HashMap<>();
    private static int countId = 0;

    public Country(String name, double population, String capital, WorldParts worldPart)
    {
        if(name != null && !name.isEmpty() && population > 0 && capital != null && !capital.isEmpty() && worldPart != null) {
            this.name = name;
            this.population = population;
            this.capital = capital;
            this.worldPart = worldPart;

            if (!hasCountry()) {
                countId++;
                this.id = countId;
                allCountries.put(id, this);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) &&
                population == country.population &&
                Objects.equals(capital, country.capital) &&
                worldPart == country.worldPart;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population, capital, worldPart);
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                ", worldPart='" + worldPart + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    //Проверяем на наличие страны в Map
    private boolean hasCountry() {
        for (Country country : allCountries.values()) {
            if (country.hashCode() == this.hashCode() && allCountries.containsValue(this))
            {
                return true;
            }
        }
        return false;
    }

    //Формируем список всех стран
    public static List<Country> getAllCountries() {
        return new ArrayList<>(allCountries.values());
    }

    //Формируем список стран из одной части света
    public static List<Country> getAllCountries(WorldParts worldPart) {
        List<Country> listAllCountries = new ArrayList<>();
        for (Country country : allCountries.values()) {
            if (country.worldPart == worldPart) {
                listAllCountries.add(country);
            }
        }
        return listAllCountries;
    }

    //Возвращаем количество стран в общем списке
    public static int getHowManyCountries() {
        return allCountries.size();
    }

    //Посчитать количество стран по части света
    public static int getHowManyCountries(WorldParts worldPart)
    {
        return getAllCountries(worldPart).size();
    }

    //Подсчёт всего населения стран в Map
    public static double getAllCountriesPopulation() {
        double countPopulation = 0;
        for (Country country : allCountries.values()) {
            countPopulation += country.population;
        }
        return countPopulation;
    }

    //Подсчёт всего населения стран по частям света
    public static double getAllCountriesPopulation(WorldParts worldPart)
    {
        double countPopulation = 0;
        for (Country country : getAllCountries(worldPart)) {
            countPopulation += country.population;
        }
        return countPopulation;
    }

    //Подсчет среднего количества населения стран в Map
    public static int getAvPopOfAllCountries() {
        return (int) getAllCountriesPopulation() / getHowManyCountries();
    }

    //Подсчет среднего количества населения стран в части света
    public static int getAvPopOfAllCountries(WorldParts worldPart) {
        return (int) getAllCountriesPopulation(worldPart) / getHowManyCountries(worldPart);
    }

    public int getId() {
        return id;
    }

    public double getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public WorldParts getWorldPart() {
        return worldPart;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setWorldPart(WorldParts worldPart) {
        this.worldPart = worldPart;
    }

    public void setName(String name) {
        this.name = name;
    }
}
