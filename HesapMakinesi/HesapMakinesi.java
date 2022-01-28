package HesapMakinesi;
import java.util.Scanner;
public class HesapMakinesi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double n1,n2;
		System.out.print("ilk sayiyi giriniz : ");
		n1 = sc.nextDouble();
		System.out.print("ikinci sayiyi giriniz : ");
		n2 = sc.nextDouble();
		
		System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n5-Mod");
		System.out.print("Secimizin : ");
		byte secim =sc.nextByte();
		
		switch(secim){
			case 1:
				System.out.println(n1+n2);
			break;
			case 2:
				System.out.println(n1-n2);
			break;
			case 3:
				System.out.println(n1*n2);
			break;
			case 4:
				System.out.println(n1/n2);
			break;
			case 5:
				System.out.println(n1%n2);
			break;
			default:
				System.out.println("hatali giris");
			break;
		}
		sc.close();
	}
}