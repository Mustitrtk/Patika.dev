package ebobekok;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int ekok, ebob=1;
        System.out.print("Ilk sayiyi giriniz : ");
        a = sc.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        b = sc.nextInt();
        int eb =a;
        if(b>a)eb=b;
        int i=1;
        while(i<=eb){
            if (i%a==0 && i%b ==0) {
                ebob =i;
            }
            
            i++;
        }
        ekok = (a*b)/ebob;
        System.out.println("Ekok : "+ekok);
        System.out.println("Ebob : "+ebob);
    }
    
}
