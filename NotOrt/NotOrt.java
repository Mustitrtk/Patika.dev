package NotOrt;
import java.util.Scanner;
public class NotOrt{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int matematik,fizik,kimya,turkce,tarih,muzik;

        System.out.print("Ogrencinin matematik notunu giriniz :");
        matematik = input.nextInt();

        System.out.print("Ogrencinin fizik notunu giriniz :");
        fizik = input.nextInt();

        System.out.print("Ogrencinin kimya notunu giriniz :");
        kimya = input.nextInt();

        System.out.print("Ogrencinin turkce notunu giriniz :");
        turkce = input.nextInt();

        System.out.print("Ogrencinin tarih notunu giriniz :");
        tarih = input.nextInt();

        System.out.print("Ogrencinin muzik notunu giriniz :");
        muzik = input.nextInt();

        double ort = (matematik+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("Not ortalaması :"+ort);
        System.out.println(ort>=60?"Gecti!":"Kaldi!");

        input.close();
    }
}