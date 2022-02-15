package CiftToplam.src.cifttoplam;
import java.util.Scanner;
public class CiftToplam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=1;
        int toplam =0;
        while(k>0){
            System.out.print("Bir sayi giriniz : ");
            k=sc.nextInt();
            if (k%2==0) {
                System.out.println("Girilen sayi cift.");
                toplam +=k;
            }
            else System.out.println("Girilen sayi tek.");
        }
        System.out.println("Cift sayilarin toplami : "+toplam);
        sc.close();
    }
    
}
