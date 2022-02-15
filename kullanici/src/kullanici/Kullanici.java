package Kullanici.src.kullanici;
import java.util.Scanner;
public class Kullanici {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String UserName="java101",Password="PatikaDev";
        
        System.out.print("Kullanici adini giriniz : ");
        String admin = sc.next();
        System.out.print("Sifre giriniz : ");
        String adminPassword = sc.next();
        
        if (admin.equals(UserName) && adminPassword.equals(Password)){
            System.out.println("Giris basarili.");
        }
        if (!adminPassword.equals(Password)) {
            System.out.println("Sifre yanlis.");
            System.out.print("Sifreyi degistirmek ister misiniz ? e/h");
            char secim = sc.next().charAt(0);
            switch(secim)
            {
                case 'e':
                    System.out.print("Yeni sifre giriniz : ");
                    adminPassword=sc.next();
                    if (!adminPassword.equals(Password)) {
                        Password = adminPassword;
                        System.out.println("Sifre basari ile degistirildi.");
                    }
                    else System.out.println("Eski sifre yenisi ile ayni olamaz.");
                    
                    break;
                case 'h':
                    break;
                
                default:
                    System.out.println("Hatali kullanici girisi.");
                    break;
            }
        }
        
        else System.out.println("Kullanici adi hatali girildi.");
        
        sc.close();
    }
    
}
