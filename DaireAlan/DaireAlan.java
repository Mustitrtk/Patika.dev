package DaireAlan;
import java.util.Scanner;
public class DaireAlan{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int r,a;
		double alan;
		final double pi = 3.14;
		
		System.out.print("Dairenin yaricapini giriniz : ");
		r = input.nextInt();
		
		System.out.print("Açıyı giriniz :");
		a=input.nextInt();
		
		alan = (pi*r*r)*a/360;
		
		System.out.println("Alan : "+alan);

		input.close();
	}
}