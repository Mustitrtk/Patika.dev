package OBS;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name=name;
        this.mpno = mpno;
        this.branch=branch;
    }


    void Print(){
        System.out.println("Teacher's name : "+this.name);
        System.out.println("Teacher's phone number: "+this.mpno);
        System.out.println("Teacher's branch : "+this.branch);
    }
}
