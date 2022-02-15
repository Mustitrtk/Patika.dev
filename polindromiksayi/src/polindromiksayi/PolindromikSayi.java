package PolindromikSayi.src.polindromiksayi;
import java.util.Scanner;
public class PolindromikSayi {
    
    public static boolean isPolindromic(int x){
        int toplam =0,temp = x,basamak;
        while(temp!=0){
            basamak = temp%10;
            toplam = toplam*10+basamak;
            temp/=10;
        }
        
        if (x == toplam) {
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int n = sc.nextInt();
        
        if (isPolindromic(n)==true) {
            System.out.println("Sayi polindromiktir.");
        }
        else System.out.println("Sayi polindromik degildir.");
        
        sc.close();
    }
    
}
