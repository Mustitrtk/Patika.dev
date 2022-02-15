package SayiTahmin;
import java.util.Scanner;
public class SayiTahmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sn = (int)(Math.random()*100+1);
        int right =0;
        int choose;

        while(right<5){
            System.out.print("1 ile 100 arasinda bir sayi giriniz : ");
            choose =  sc.nextInt();
            if(choose >100 || choose <1){ 
                System.out.println("Hata, sayi deger araliginda degil!"); 
                break;
            }

            if(sn == choose){
                System.out.println("Tahmininiz dogru !");
                System.out.println("Kazandiniz !");
                break;
            }
            else{
                right++;
                System.out.println("Tahmininiz yanlis !");
                if(sn<choose){
                    System.out.println(choose+" Sayiniz gizli sayidan buyuk !");
                }
                else System.out.println(choose+" Sayiniz gizli sayidan kucuktur !");
                System.out.println("Kalan hakkiniz : "+(5-right));
                System.out.println("");
            }
            if(right==5) System.out.println("Kaybettiniz ! gizli sayi : "+sn);
        }

        sc.close();
    }
}
