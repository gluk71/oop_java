package src;

public class Main {

    public static void main(String[] args) {


        Persona father = new Persona("Roman", "Men", 63, "Father");
        Persona son = new Persona("Slavka", "Men", 43, "Son");
        Persona daughter = new Persona("Katerina", "Women", 25, "Daughter");
        Persona granddaughter = new Persona("Inna", "Women", 7, "Granddaughter");

        father.PersAnimal.AddAnimal("Fish", "Rodka");
        father.PersAnimal.AddAnimal("Fish", "Borka");

        son.PersAnimal.AddAnimal("Cat", "Gnom");
        son.PersAnimal.AddAnimal("Dog", "Ara");

        daughter.PersAnimal.AddAnimal("Snake", "Gooroo");

        granddaughter.PersAnimal.AddAnimal("Spider", "Zyyza");

        daughter.AddName(granddaughter);
        father.AddName(daughter);
        father.AddName(son);

        view.treeView(father, 1);

        System.out.println("*".repeat(25));
        view.bookView(father);

        System.out.println("*".repeat(25));
        view.bookView(son);

        System.out.println("*".repeat(25));
        view.bookView(daughter);

        System.out.println("*".repeat(25));
        view.bookView(granddaughter);

        father.Voice();
        father.AddName(son);
        father.AddName(daughter);

    }
}
