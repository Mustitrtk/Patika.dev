package NotOrt2;
import java.util.Scanner;
public class NotOrt2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double mat,fiz,kimya,turkce,muzik;
		
		System.out.print("Matematik notunuzu giriniz : ");
		mat = sc.nextDouble();
		if(mat <0 || mat >100)mat=0;
		
		System.out.print("Fizik notunuzu giriniz : ");
		fiz = sc.nextDouble();
		if(fiz <0 || fiz >100)fiz=0;
		
		System.out.print("Kimya notunuzu giriniz : ");
		kimya = sc.nextDouble();
		if(kimya <0 || kimya >100)kimya=0;
		
		System.out.print("Turkce notunuzu giriniz : ");
		turkce = sc.nextDouble();
		if(turkce <0 || turkce >100)turkce=0;
		
		System.out.print("Muzik notunuzu giriniz : ");
		muzik = sc.nextDouble();
		if(muzik <0 || muzik >100)muzik=0;
		
		double avg = (mat+fiz+kimya+turkce+muzik)/5;
		
		System.out.println("Ortalama :"+avg+" , "+(avg>=55?"gectiniz.":"kaldiniz."));

		sc.close();
	}
}