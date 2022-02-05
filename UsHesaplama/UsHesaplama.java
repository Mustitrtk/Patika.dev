package UsHesaplama;
import java.util.Scanner;
public class UsHesaplama {
    static int pow(int a, int b){
        if(b==0) return 1;
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Alt degeri giriniz : ");
        int a = sc.nextInt();
        System.out.print("Ust degeri giriniz : ");
        int b = sc.nextInt();

        System.out.println("Sonuc : "+pow(a, b));

        sc.close();
    }
}
