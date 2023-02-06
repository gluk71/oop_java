package src;

public abstract class Animals {
    private String Animals;
    private String AnimalsName;


    public void SetAnimals(String animals){

        this.Animals = animals;
    }
    public void SetAnimalsName(String animalsname){

        this.AnimalsName = animalsname;
    }


    public String GetAnimals(){
        return Animals;
    }
    public String GetAnimalsName(){

        return AnimalsName;
    }
}


