package src;

import java.util.ArrayList;

class ListAnimals{
    public String bAnimal;
    public String bName;

}

public class Klass_animals extends Animals{
    public String AnName;
    public Klass_animals(String anName){
        this.AnName = anName;
    }

    ArrayList<ListAnimals> listAnimals = new ArrayList<>();

    public void AddAnimal(String AName, String animalsName){
        ListAnimals lb = new ListAnimals();
        SetAnimals(AName);
        SetAnimalsName(animalsName);

        lb.bAnimal = GetAnimals();
        lb.bName = GetAnimalsName();

        listAnimals.add(lb);
    }

    public ArrayList<ListAnimals> getBookList(){
        return listAnimals;
    }

}