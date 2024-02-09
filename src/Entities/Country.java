package Entities;

import java.util.ArrayList;

public class Country {
    private int Id;
    private static int id;

    private ArrayList<City> cities;

    public String Name;
    public int Population;
    public Country(String name){
        id++;
        Id=id;
        Name=name;
        cities = new ArrayList<>();
    }

    public int getId() {
        return Id;
    }

    public void AddCity(City city){
        cities.add(city);
        Population+=city.Population;
    }


    public void fullInfo(){
        System.out.println("Name: "+Name+"\nPupulation: "+Population);
    }
    public void showAllCities(){
        System.out.println("List of Cities");
        for (City city: cities){
           city.fullInfo();
        }
    }

    /*Şəhərlər və ölkələr iki classımız olacaq(yəni City və Country)
      Şəhərlər - unikal İd, Name, Population, Fullİnfo - Name və Population göstərsin
      Ölkələr - unikal İd, Name, Population, Şəhərləri saxlayan array
      Fullİnfo metodu - Name, Population göstərsin
      CityList - bütün şəhərləri göstərsin
      AddCity - metodunda eyni adda şəhər əlavə etməyə icazə verməyin, hər yeni .əhər add olunduqca
      onun population ölkələrin population-in üstünə gəlin.
      ChangeCityPopulation - int id və int tipindən population qəbul edir həmin id-li city tapıb population-u dəyişmək lazımdı

     */
}
