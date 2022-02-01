package sayisiralama;
import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        
        System.out.print("ilk sayiyi giriniz : ");
        a = sc.nextInt();
        
        System.out.print("ikinci sayiyi giriniz : ");
        b = sc.nextInt();
        
        System.out.print("ucuncu sayiyi giriniz : ");
        c = sc.nextInt();
        
        if (a>=b && a>=c) {
            if (b>=c) {
                System.out.println("Buyukten kucuge sirali hali : "+a+" "+b+" "+c);
            }
            else System.out.println("Buyukten kucuge sirali hali : "+a+" "+c+" "+b);
        }
        else if (b>=a && b>=c) {
            if (a>=c) {
                System.out.println("Buyukten kucuge sirali hali : "+b+" "+a+" "+c);
            }
            else System.out.println("Buyukten kucuge sirali hali : "+b+" "+c+" "+a);
        }
        else if(c>=a && c>=b){
            if (a>=b) {
                System.out.println("Buyukten kucuge sirali hali : "+c+" "+a+" "+b);
            }
            else System.out.println("Buyukten kucuge sirali hali : "+c+" "+b+" "+a);
        }
        
        sc.close();
    }
    
}
