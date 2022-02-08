package AsalMi;
import java.util.Scanner;
public class AsalMi {
    static int asalMi(int a,int b){

        if(b==1) return 1;

        if(a % b==0) return 0;

        else return asalMi(a, b-1);
    }

    static boolean control(int a,int b){

        if(asalMi(a,b)==1) return false;

        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = -1,b;

        while(a!=0){

            System.out.print("Bir sayi giriniz : ");

            a = sc.nextInt();
            b=a-1;
            
            if(control(a,b)==false) System.out.println("Sayi asaldir.");
            else System.out.println("Sayi asal degildir.");
        }

        sc.close();
    }
    
}
