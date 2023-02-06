package src;

import java.util.ArrayList;


public class Persona extends Human {
    public Klass_animals PersAnimal;

    public Persona(String Name, String Sex, int Age, String PersAnimal) {
        SetSex(Sex);
        SetName(Name);
        SetAge(Age);
        this.PersAnimal = new Klass_animals(PersAnimal);
    }
    ArrayList<Persona> listName = new ArrayList<>();

    public void AddName(Persona persona) {
        listName.add(persona);
    }

    public ArrayList<Persona> getListName() {
        return listName;
    }

    public void Voice() {
        String name = GetName();

        System.out.println("\"Animals of our family\" - wrote " + name );
    }
}