package OBS;

public class Student {
   String name;
   String no;
   course c1;
   course c2;
   course c3;
   boolean isPass;
   
   Student(String name, String no, course c1, course c2, course c3){
       this.name= name;
       this.no=no;
       this.c1=c1;
       this.c2=c2;
       this.c3=c3;
   }

   void addNote(int note, int note2, int note3){
       if(note>=0 && note<=100){
           this.c1.exam=note;
       }

       if(note2>=0 && note2<=100){
        this.c2.exam=note2;
        }

        if(note3>=0 && note3<=100){
            this.c3.exam=note3;
        }
   }

   void addQuiz(int q1, int q2, int q3){
        if(q1>=0 && q1<=100){
            this.c1.quiz=q1;
        }
        
        if(q2>=0 && q2<=100){
            this.c2.quiz=q2;
        }
        
        if(q3>=0 && q3<=100){
            this.c3.quiz=q3;
        }
   }

   void Avg(course c1, course c2, course c3){
       this.c1.avg = (c1.quiz*c1.quizRate/100)+(c1.exam*(100-c1.quizRate)/100);
       System.out.println(isPass(this.c1)==true?"Student passed! "+this.c1.name:"Student failed! "+this.c1.name);

       this.c2.avg= (c2.quiz*c2.quizRate/100)+(c2.exam*(100-c2.quizRate)/100);
       System.out.println(isPass(this.c2)==true?"Student passed! "+this.c2.name:"Student failed! "+this.c2.name); 

       this.c3.avg= (c3.quiz*c3.quizRate/100)+(c3.exam*(100-c3.quizRate)/100);
       System.out.println(isPass(this.c3)==true?"Student passed! "+this.c3.name:"Student failed! "+this.c3.name); 
   }

   boolean isPass(course c){
        double avg = c.avg;
        if(avg>=60) this.isPass = true;
        else this.isPass = false;

        return this.isPass;
   }
   
   void studentPrint(){
       System.out.println("Student's name : "+this.name);
       System.out.println("Student's no : "+this.no);
       System.out.println("Student's course 1 :"+this.c1.name+"\nStudent's avg : "+this.c1.avg);
       System.out.println("Student's course 2 :"+this.c2.name+"\nStudent's avg : "+this.c2.avg);
       System.out.println("Student's course 3 : "+this.c3.name+"\nStudent's avg : "+this.c3.avg);
   }
}
