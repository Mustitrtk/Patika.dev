package DeseneGoreMetod;
import java.util.Scanner;
public class Desen {
    static void azalt(int a,int b){
        if(a<=0) art(a,b);
        else
        {
            System.out.print(a+" ");
            azalt(a-5,b);
        }
    }
    static void art(int a,int b){
        if(a<=b){
            System.out.print(a+" "); 
            art(a+5,b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int a = sc.nextInt();
        int b = a;
        azalt(a, b);
        sc.close();
    }
    
}
