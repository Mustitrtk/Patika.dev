package UcgenAlan;
import java.util.Scanner;
public class UcgenAlan{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a,b;
		double alan,u,c=0.0;
		
		System.out.print("Dik ucgenin birinci kenari giriniz : ");
		a = input.nextInt();
		
		System.out.print("Dik ucgenin ikinci kenari giriniz : ");
		b = input.nextInt();
		
		c = Math.sqrt((a*a)+(b*b));
		System.out.println("hipotenus : "+c);

		u = (a+b+c)/2;
		
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Alan : "+alan);

		input.close();
	}
}