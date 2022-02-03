package ArtikYil;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.xml.validation.Schema;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yil;
        System.out.print("Yil giriniz : ");
        yil = sc.nextInt();
        
        if(yil%4==0){
            System.out.println("Artik yildir.");
        }
        else System.out.println("Artik yil degildir.");  
        sc.close();
    }
}
