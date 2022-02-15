package BasamakToplam;
import java.util.Scanner;
public class BasamakToplam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int toplam =0;
        System.out.print("Bir sayi giriniz : ");
        n = sc.nextInt();
        
        while(n>0){
            toplam += (n%10);
            n = n/10;
        }
        
        System.out.println("Basamaklar toplamı : "+toplam);
        sc.close();
    }
    
}
