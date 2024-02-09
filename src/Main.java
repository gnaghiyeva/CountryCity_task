import Entities.City;
import Entities.Country;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Country country = new Country("Azerbaijan");
        country.AddCity(new City("Baku",4000000));
        country.AddCity(new City("Gandja",450000));

//        System.out.println(country.Population);
//        country.fullInfo();
        country.showAllCities();



        }
    }
