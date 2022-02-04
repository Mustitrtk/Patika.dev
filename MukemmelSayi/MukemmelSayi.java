package MukemmelSayi;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,total=0;
        System.out.print("Bir sayi giriniz : ");
        n = sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                total=total+i;
            }
        }
        if(n==total) System.out.println(n+" bir mukemmel sayidir.");
        else System.out.println(n+" bir mukemmel sayi degildir.");
        sc.close();
    }
}
