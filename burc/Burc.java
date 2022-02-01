package burc;
import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ay,gun;
        String burc="";
        System.out.print("Gun giriniz : ");
        gun = sc.nextInt();
        
        System.out.print("Ay giriniz : ");
        ay = sc.nextInt();
        
        if (ay == 1) {
            if (gun <= 21) {
               burc = "oglak"; 
            }
            else burc ="kova";
        }
        else if (ay == 2) {
            if (gun<=19) {
                burc = "kova";
            }
            else burc = "balik";
        }
        else if (ay == 3) {
            if (gun <= 20) {
                burc = "balik";
            }
            else burc = "koc";
        }
        else if (ay == 4) {
            if (gun <= 20) {
                burc = "koc";
            }
            else burc = "boga";
        }
        else if (ay == 5) {
            if (gun <= 21) {
                burc = "boga";
            }
            else burc = "ikizler";
        }
        else if (ay == 6) {
            if (gun <= 22) {
                burc = "ikizler";
            }
            else burc = "yengec";
        }
        else if (ay == 7) {
            if (gun <= 22) {
                burc = "ikizler";
            }
            else burc = "aslan";
        }
        else if (ay == 8) {
            if (gun <= 22) {
                burc = "aslan";
            }
            else burc = "basak";
        }
        else if (ay == 9) {
            if (gun <= 22) {
                burc = "basak";
            }
            else burc = "terazi";
        }
        else if (ay == 10) {
            if (gun <= 22) {
                burc = "terazi";
            }
            else burc = "akrep";
        }
        else if (ay == 11) {
            if (gun <= 21) {
                burc = "akrep";
            }
            else burc = "yay";
        }
        else if (ay == 12) {
            if (gun <= 21) {
                burc = "yay";
            }
            else burc = "oglak";
        }
        
        System.out.println("Burcunuz : "+burc);
        sc.close();
    }
    
}
