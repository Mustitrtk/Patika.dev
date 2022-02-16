package PolindromKelime;
import java.util.Scanner;
public class PolindromKelime{
    static boolean isPolindrom(String n){
        String reverse ="";

        for(int i = n.length()-1;i>=0;i--){
            reverse+=n.charAt(i);
        }
        
        if(reverse.equalsIgnoreCase(n)){
            return true;
        }
        
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir kelime giriniz : ");
        String s = sc.next();

        if(isPolindrom(s)) System.out.println("Kelime polindromiktir.");
        else System.out.println("Kelime polindromik degildir.");

        sc.close();
    }
}