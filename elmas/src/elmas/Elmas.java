package Elmas.src.elmas;
import java.util.Scanner;;
public class Elmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Pozitif bir deger giriniz : ");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int a = n-1; a >= 0; a--) {
            for (int b = 0; b < n-a; b++) {
                System.out.print(" ");
            }
            for (int c = (2*a)-1; c >= 1; c--) {
                System.out.print("*");
            }
            System.out.println("");
            
            sc.close();
        }
    }
    
}
