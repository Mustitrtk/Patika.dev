package havasıcaklıgınagöreetkinlik;
import java.util.Scanner;
public class HavaSıcaklıgınaGöreEtkinlik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sicaklik;
        System.out.print("Sicaklik giriniz : ");
        sicaklik = sc.nextInt();
        
        if (sicaklik>=5) {
            if (sicaklik>=15) {
                if (sicaklik>=25) {
                    System.out.println("Yüzmek eğlenceli olabilir.");
                }
                else System.out.println("Piknik yapmak iyi olabilir.");
            }
            else System.out.println("Sinemaya gitmek eğlenceli olabilir.");
        }
        else System.out.println("Kayak için uygun bir hava.");
        
        sc.close();
    }
    
}
