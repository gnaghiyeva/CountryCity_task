package Entities;

public class City {
    private int Id;
    private static int id;
    public String Name;
    public int Population;
    public City(String name, int population){
        id++;
        Id=id;
        Name=name;
        Population=population;
    }

    public int getId() {
        return Id;
    }

    public void fullInfo(){
        System.out.println("Name: "+Name+"\nPupulation: "+Population);
    }


}
