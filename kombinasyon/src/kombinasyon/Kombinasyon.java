package Kombinasyon.src.kombinasyon;
import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r;
        int a=1,b=1,nr=1;
        System.out.print("n sayisini giriniz : ");
        n = sc.nextInt();
        System.out.print("r sayisini giriniz : ");
        r = sc.nextInt();
        
        for (int i = 1; i <=n ; i++) {
            a=a*i; // n'nin faktoriyeli
        }
        for (int j = 1; j <=r; j++) {
            b =b*j; // r'nin faktoriyeli 
        }
        for (int k = 1; k <= n-r; k++) {
            nr = nr*k; // (n-r)'nin faktoriyeli 
        }
        System.out.println("Kombinasyon : "+(a/(b*nr)));
        
        sc.close();
    }
    
}
