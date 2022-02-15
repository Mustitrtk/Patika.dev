package DonguOr1.DonguOr1.src.donguor1;
import java.util.Scanner;
public class DonguOr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int toplam = 0;
        int sayac =0;
        System.out.print("Bir sayi giriniz : ");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i%12==0) {
                System.out.print(i+" ");
                toplam +=i;
                sayac++;
            }
        }
        
        System.out.println("Ortalama : "+(double)(toplam/sayac));

        sc.close();
    }
    
}
