package UcakBileti;
import java.util.Scanner;
public class UcakBileti{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int mesafe,yas,yolsecimi = 3;
		int tutar =0,indirimlitutar=0;
		System.out.print("Yol mesafesini giriniz : ");
		mesafe = sc.nextInt();
		
		tutar = (int)(mesafe*0.10);
		
		System.out.print("Yas giriniz : ");
		yas = sc.nextInt();
		
		if(yas<12){
			indirimlitutar = (int) (tutar*0.50);
		}
		else if(yas>65){
			indirimlitutar = (int) (tutar*0.30);
		}
		else indirimlitutar = (int)(tutar*0.10);
		
		tutar = tutar - indirimlitutar;
		
		while(yolsecimi > 2)
		{
			System.out.print("Yon seciniz: \nntek yon : 1 \ncift yon : 2  \nsecim :");
			yolsecimi = sc.nextInt();
			if(yolsecimi == 2){
				indirimlitutar = (int)(tutar*0.20);
			}
			else if(yolsecimi == 1){}
			else System.out.println("Hatali giris.");
		}
		
		tutar = tutar-indirimlitutar;
		
		System.out.println("Tutariniz : "+tutar*2);
		
		sc.close();
	}
}