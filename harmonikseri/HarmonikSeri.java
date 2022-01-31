package harmonikseri;
import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sonuc=0.0;
        System.out.print("Bir sayi giriniz : ");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            sonuc += (1.0/i);
        }
        
        System.out.println("Harmonik sonuc : "+sonuc);
        sc.close();
    }
    
}
