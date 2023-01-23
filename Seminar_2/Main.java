public class Main {

    public static void main(String[] args) {

        Person daughter = new Persona("Elvira", "Women", 25, "Daughter");
        Person granddaughter = new Persona("Tamara", "Women", 7, "Granddaughter");
        Person father = new Persona("Ioann", "Men", 63, "Father");
        Person son = new Persona("Slavka", "Men", 43, "Son");

        father.PersAnimal.AddAnimal("Fish", "Rodka");
        father.PersAnimal.AddAnimal("Fish", "Borka");

        son.PersAnimal.AddAnimal("Cat", "Pluh");
        son.PersAnimal.AddAnimal("Dog", "Rex");

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
