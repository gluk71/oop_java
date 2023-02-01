package src;

public class View {
    public static void depView(Group root){
        System.out.println("Department name" +" "+ root.deptName);
        for (var a: root.personaInDept) {
            System.out.println("FIO:"+ a.pFIO +" "+ "Gender:"+ a.pSex+" "+ "Age:"+ a.pAge);
        }
    }
}
