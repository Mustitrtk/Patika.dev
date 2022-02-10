package OBS;
import java.util.Scanner;
public class Obs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String stdName = sc.nextLine();
        System.out.print("Enter your school number : ");
        String no = sc.next();

        System.out.println("---------------------------------------");

        Teacher t1 = new Teacher("Pr. Dr. Samet", "0000", "Fizik");
        t1.Print();
        System.out.println("");

        Teacher t2 = new Teacher("Pr. Dr. Serpil", "0000", "Matematik");
        t2.Print();
        System.out.println("");

        Teacher t3 = new Teacher("Pr. Dr. Kamil", "0000", "Fizik lab.");
        t3.Print();

        System.out.println("---------------------------------------");

        course c = new course("Fizik", "005", "Fizik", 30, t1);
        c.TeacherAdded(t1);
        course c2 = new course("Matematik", "003", "Matematik", 20, t2);
        c2.TeacherAdded(t2);
        course c3 =new course("Fizik lab.", "007", "Fizik lab.", 30, t3);
        c3.TeacherAdded(t3);

        System.out.println("---------------------------------------");

        Student student = new Student(stdName, no, c,c2,c3);
        student.addNote(70, 65, 55);
        student.addQuiz(80, 85, 80);

        student.Avg(c,c2,c3);

        System.out.println("---------------------------------------");

        student.studentPrint();
        
        sc.close();
    }
}
