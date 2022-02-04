package TersUcgen;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Bir sayi giriniz : ");
        n = sc.nextInt();
        for(int i = n;i>0;i--){
            for(int j =n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
