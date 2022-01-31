package uslusayi;
import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        int anw =1;
        System.out.print("Bir sayi giriniz : ");
        n = sc.nextInt();
        System.out.print("Ussunu giriniz : ");
        k = sc.nextInt();
        if (k<0) {
            for (int j = 1; j <= -1*k; j++) {
                anw = anw*n;
            }
            System.out.println("cevap : 1/"+anw);
        }
        
        else{
            for (int i = 1; i <=k; i++) {
                anw = anw*n;
            }
            System.out.println("cevap : "+anw);
        }
        
        
        sc.close();
    }
    
}
