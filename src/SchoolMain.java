import java.util.ArrayList;
import java.util.List;


public class SchoolMain {
    public static void main(String[] args) {
        Teacher joshua = new Teacher(1,"Joshua",500);
        Teacher kim = new Teacher(2,"Kim",700);
        Teacher hector = new Teacher(3,"Hector",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(joshua);
        teacherList.add(kim);
        teacherList.add(hector);


        Student maya = new Student(1,"Maya Taylor" ,4);
        Student sam = new Student(2,"Sam Smith",12);
        Student kerry = new Student(3,"Kerry Underwood",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(maya);
        studentList.add(kerry);
        studentList.add(sam);




        School CFH = new School(teacherList,studentList);

        Teacher tyson = new Teacher(6,"Tyson", 900);

        CFH.addTeacher(tyson);


        maya.payFees(5000);
        sam.payFees(6000);
        System.out.println("CFH has earned $"+ CFH.getTotalMoneyEarned());

        System.out.println("\nPaying Salaries....\n ");
        joshua.receiveSalary(joshua.getSalary());
        System.out.println("CFH has paid the salary for: " + joshua.getName()
        +" \nBalance after payment: $" + CFH.getTotalMoneyEarned() + "\n");

        hector.receiveSalary(hector.getSalary());
        System.out.println("CFH has paid the salary for: " + hector.getName()
                +" \nBalance after payment: $" + CFH.getTotalMoneyEarned()+ "\n");


        System.out.println(sam);

        kim.receiveSalary(kim.getSalary());

        System.out.println(kim);


    }
}