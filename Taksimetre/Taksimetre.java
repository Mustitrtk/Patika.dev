package Taksimetre;
import java.util.Scanner;
public class Taksimetre{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int km;
		double artıs = 2.20,total=10.0;
		
		System.out.print("Km giriniz : ");
		km = input.nextInt();
		
		total = total+(km*artıs);
		total =(total<20?20:total);
		
		System.out.println("Odenecek toplam tutar : "+total);
		input.close();
	}
}