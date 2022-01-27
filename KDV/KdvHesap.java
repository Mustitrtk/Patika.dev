package KDV;
import java.util.Scanner;
public class KdvHesap{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double kdv =0.0;
		
		System.out.print("Tutar giriniz :");
		double tutar = input.nextDouble();
		
		kdv = (tutar>=100?tutar*0.08:tutar*0.18);
		
		System.out.println("tutar : "+tutar);
		System.out.println("kdv : "+kdv);
		System.out.println("kdv li tutar : "+(tutar+kdv));

		input.close();
	}
}