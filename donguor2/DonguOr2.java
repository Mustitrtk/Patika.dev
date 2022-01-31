package donguor2;
import java.util.Scanner;
public class DonguOr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Bir sayi giriniz : ");
        n = sc.nextInt();
        
        for (int i = 1,j=1; i <= n && j<=n; i*=4,j*=5) {
            System.out.println(i+" "+j);
        }
        
        sc.close();
    }
    
}
