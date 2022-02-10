package OBS;

public class course {
    Teacher teacher;
    String name;
    String code;
    String  prefix;
    int quiz;
    int exam;
    int quizRate;
    double avg;

    course(String name, String code, String prefix, int rate, Teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.quiz=0;
        this.exam=0;
        this.avg=0;
        this.quizRate = rate;
    }

    void TeacherAdded(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.teacher=teacher;
        }
        else System.out.println("Ders bolumu ile ogretmenin alani uyusmuyor.");
    }

    void printTeacher(){
        if(this.teacher !=null) System.out.println(this.name+" teacher : "+this.teacher);
    }
}
