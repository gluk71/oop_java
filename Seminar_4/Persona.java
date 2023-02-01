package src;

import java.util.Scanner;

public class Persona {
    String pFIO;
    String pSex;
    int pAge;

    public Persona(String p_FIO, String p_Sex, int p_Age){
        this.pFIO = p_FIO;
        this.pSex = p_Sex;
        this.pAge = p_Age;
    }

    public String getpFIO() {
        return pFIO;
    }
    public String getpSex() {
        return pSex;
    }
    public int getpAge() {
        return pAge;
    }

    public boolean checkAddGroup(Group group){
        System.out.println("Add to Group " + group.deptName + "?");
        Scanner in = new Scanner(System.in);
        System.out.println("0 - NO\n1 - YES");
        int choice = in.nextInt();
        return choice != 0;
    }

    public void Display(){
        System.out.println("FIO:"+ getpFIO() +" "+ "Gender:"+ getpSex()+" "+ "Age:"+ getpAge());
    }
}
