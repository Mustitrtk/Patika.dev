package VucutKitle;
import java.util.Scanner;
public class VucutKitle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int kilo;
		double boy;
		double kitle=0.0;
		
		System.out.print("Boyunuzu metre cinsinden giriniz : ");
		boy = input.nextDouble();
		
		System.out.print("Kilonuzu giriniz : ");
		kilo = input.nextInt();
		
		kitle = (double)(kilo/(boy*boy));
		
		System.out.println("Vucut Kitle indexiniz : "+kitle);
		input.close();
	}
}