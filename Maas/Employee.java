package Maas;

public class Employee{
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name, Double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        if( this.salary>1000 ){
            return (double)(this.salary*3/100);
        }
        else return 0.0;
    }

    double bonus(){
        double hours=0.0;
        if(this.workHours > 40){
            hours=workHours-40;
            return (Double)(hours*30);
        }
        else return 0.0;
    }

    double raiseSalary(){
        int hireYear = 2021-this.hireYear;
        if(hireYear > 9 && hireYear< 20){
            return (Double)(this.salary*10/100);
        }
        else if(hireYear<10){
            return (Double)(this.salary*5/100);
        }
        else return (Double)(this.salary*20/100);
    }

    void _toString(){
        double tax,bonus, raise;
        tax = this.tax();
        bonus =this.bonus();
        raise = this.raiseSalary();

        System.out.println("İsim : "+this.name);
        System.out.println("Maasi : "+this.salary);
        System.out.println("Calisma saati : "+this.workHours);
        System.out.println("Baslangic tarihi : "+this.hireYear);
        System.out.println("Vergi : "+tax);
        System.out.println("Bonus : "+bonus);
        System.out.println("Maas artisi : "+raise);
        System.out.println("Vergi ve bonuslu maasi : "+(this.salary+tax+bonus));
        System.out.println("Toplam maas : "+(this.salary+tax+bonus+raise));
    }
}