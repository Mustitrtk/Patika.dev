package Manav;
import java.util.Scanner;
public class Manav{
	/*Armut : 2,14 TL
	Elma : 3,67 TL
	Domates : 1,11 TL
	Muz: 0,95 TL
	Patlıcan : 5,00 TL*/
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int kg;
		double total=0.0;
		double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00;
		
		System.out.print("Armut kac kilo : ");
		kg = input.nextInt();
		total += (armut*kg);
		
		System.out.print("Elma kac kilo : ");
		kg = input.nextInt();
		total += (elma*kg);
		
		System.out.print("Domates kac kilo : ");
		kg = input.nextInt();
		total += (domates*kg);
		
		System.out.print("Muz kac kilo : ");
		kg = input.nextInt();
		total += (muz*kg);
		
		System.out.print("Patlıcan kac kilo : ");
		kg = input.nextInt();
		total += (patlıcan*kg);
		
		System.out.println("tutar : "+total);
		input.close();
	}
}