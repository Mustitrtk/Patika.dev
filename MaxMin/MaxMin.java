package MaxMin;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,eb=0,ek=0;
        int a;
        System.out.print("Kac adet sayi gireceginizi belirtiniz : ");
        n = sc.nextInt();
        for(int i =1; i<=n;i++){
            System.out.print(i+" . sayiyi giriniz : ");
            a = sc.nextInt();
            if(eb<a) eb =a;
            if(ek>a) ek =a;
        }
        System.out.println("En buyuk deger : "+eb);
        System.out.println("En kucuk deger : "+ek);
        sc.close();
    }
}
