import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Main run = new Main();

    Scanner in = new Scanner(System.in);
        String FIO;
        String Sex;
        int Age;

        System.out.println("-".repeat(26));
        System.out.println("Sorting by parameter:");

        System.out.println("FIO worker: ");
        FIO = in.nextLine();

        System.out.println("Gender worker: ");
        Sex = in.nextLine();

        System.out.println("Age worker: ");
        Age = in.nextInt();

    Persona p = new Persona(FIO, Sex, Age);
    p.Display();

    Group depAcc = new Group("Accounting");
    run.addPersonaToDepartment(p, depAcc);
    View.depView(depAcc);
    Group depAcc1 = new Group(run.UpdateDepint());
    run.addPersonaToDepartment(p, depAcc1);
    View.depView(depAcc1);
    }

    public void addPersonaToDepartment(Persona persona, Group group){
        boolean check = persona.checkAddGroup(group);
        if (check) {
            group.addPeople(persona);
        } else {
            System.out.println("Refused!");
        }
    }

    public String UpdateDepint()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to move to another department?:");
        System.out.println("0 - NO\n1 - YES");
        int answer = scanner.nextInt();

        if (answer==0 ){
            System.out.println("GOODBAY!!!");
        }
        if(answer==1){
            System.out.println("Which department do you want to move to?");
            System.out.println("1 - IT\n2 - Logistics\n3 - Finance");
        }
        int answer1 = scanner.nextInt();
        String s="";
        if (answer1==1 ){
            s="\"IT\"";
            System.out.println(s);
        }
        if (answer1==2 ){
            s="\"Logistics\"";
            System.out.println(s);
        }
        if (answer1==3 ){
            s="\"Finance\"";
            System.out.println(s);
        }
        return s;
        }
    }


