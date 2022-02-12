package MaksMinDeger;
import java.util.Scanner;
import java.util.Arrays;
public class MaksMinDeger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] dizi = {13,21,6,8,5,12};
        Arrays.sort(dizi);
        System.out.print("Sayi giriniz : ");
        int secim = sc.nextInt();
        int eks=dizi[0],ebs=dizi[0];

        for(int i =0; i<dizi.length;i++){
            if(dizi[i]<= secim) eks = dizi[i];
        }

        for(int j=dizi.length-1;j>=0;j--){
            if(dizi[j]>=secim) ebs=dizi[j];
        }

        System.out.println("Min en yakın sayi : "+eks);
        System.out.println("Max en yakın sayi : "+ebs);
        sc.close();
    }
}
