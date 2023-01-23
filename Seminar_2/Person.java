import java.util.ArrayList;

public class Persona extends Human {
    public Klass_animals PersAnimal;

    public Person(String Name, String Sex, int Age, String PersAnimal) {
        SetSex(Sex);
        SetName(Name);
        SetAge(Age);
        this.PersAnimal = new Class_animals(PersAnimal);
    }
    ArrayList<Persona> listName = new ArrayList<>();

    public void AddName(Persona persona) {
        listName.add(persona);
    }

    public ArrayList<Person> getListName() {
        return listName;
    }

    public void Voice() {
        String name = GetName();

        System.out.println("\"Animals of our family\" - wrote " + name );
    }
}
