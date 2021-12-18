package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CountryTest {

    private Country country;
    private Country country1;
    private Country country2;
    private Country country3;

    //метод будет выполнятся перед каждым тестируемым методом
    @Before
    public void setUp() throws Exception {
        country = new Country("Belgium", 11.5, "Brussels", WorldParts.Europe);
        country1 = new Country("Egypt", 100, "Cairo", WorldParts.Africa);
        country2 = new Country("Kazakhstan", 19, "Nur-Sultan", WorldParts.Asia);
        country3 = new Country("Greece", 10.7, "Athens", WorldParts.Europe);
    }

    @Test
    public void getAllCountries() {

        //создаём список expected и заполняем его данными нашего метода
        List<Country> expected = Country.getAllCountries();

        //создаём список actual и помещаем туда данные для сравнения
        List<Country> actual = new ArrayList<>();
        actual.add(country);
        actual.add(country1);
        actual.add(country2);
        actual.add(country3);

        //запускаем тест
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllCountries_NO_NULL() {
        //добавим проверку на null
        List<Country> expected = Country.getAllCountries();
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllCountries_EUROPE() {

        List<Country> expected = Country.getAllCountries(WorldParts.Europe);

        List<Country> actual = new ArrayList<>();
        actual.add(country);
        actual.add(country3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllCountries_EUROPE_NO_NULL() {
        //проверка на null
        List<Country> expected = Country.getAllCountries(WorldParts.Europe);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getHowManyCountries() {

        int expected = Country.getHowManyCountries();

        int actual = 4;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyCountries_EUROPE() {

        int expected = Country.getHowManyCountries(WorldParts.Europe);

        int actual = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllCountriesPopulation() {

        double expected = Country.getAllCountriesPopulation();

        double actual = 100 + 11.5 + 19 + 10.7;

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void getAllCountriesPopulation_EUROPE() {

        double expected = Country.getAllCountriesPopulation(WorldParts.Europe);

        double actual = 11.5 + 10.7;

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void getAvPopOfAllCountries() {

        int expected = Country.getAvPopOfAllCountries();

        int actual = (int) (11.5 + 100 + 19 + 10.7) / 4;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAvPopOfAllCountries_EUROPE() {

        int expected = Country.getAvPopOfAllCountries(WorldParts.Europe);

        int actual = (int) (11.5 + 10.7) / 2;

        Assert.assertEquals(expected, actual);
    }
}