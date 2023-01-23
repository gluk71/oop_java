public class view {
    public static void treeView(Persona root, int num){
        String line = "_".repeat(num);
        System.out.println(line + root.PersAnimal.AnName + " " + root.GetName() + ", Gender: " + root.GetSex() + ", Years: " + root.GetAge());

        for (Persona a: root.getListName()) {
            treeView(a, num + 1);
        }
    }
    public static void bookView(Persona root){
        System.out.println("Type of animals: " + root.PersAnimal.AnName);
        for (ListAnimals a: root.PersAnimal.listAnimals) {
            System.out.println(a.bAnimal + " " + a.bName);
        }
    }
}
