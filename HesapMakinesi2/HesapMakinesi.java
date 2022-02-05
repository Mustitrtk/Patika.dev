package HesapMakinesi2;
import java.util.Scanner;
public class HesapMakinesi {
    static Scanner _sc = new Scanner(System.in);
    static int a;
    static int b;
    static void Deger(){
        System.out.print("Ilk sayiyi giriniz : ");
        a = _sc.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        b =_sc.nextInt();
    }

    static int Toplama(){
        return a+b;
    }

    static int Cikarma(){
        return a-b;
    }

    static int Carpma(){
        return a*b;
    }
    static int Bolme(){
        return a/b;
    }

    static int Us(){
        int sonuc =1;
        for(int i =1;i<=b;i++){
            sonuc *=a;
        }
        return sonuc;
    }

    static int Faktoriyel(int a){
        if(a==0){
            return 1;
        }
        return a*Faktoriyel(a-1);
    }

    static int Mod(){
        return a%b;
    }

    static void Dikdortgen(){
        System.out.println("Alan : "+(a*b)+" \nCevre : "+(2*(a+b)));
    }

    public static void main(String[] args) {
        int secim=-1;

        while(secim !=0){
            System.out.print("Secim menüsü :"+ 
                                "\n1-Toplama"+ 
                                "\n2-Cikarma"+ 
                                "\n3-Carpma"+
                                "\n4-Bolme"+ 
                                "\n5-Uslu sayi hesaplama"+ 
                                "\n6-Faktoriyel hesaplama"+ 
                                "\n7-Mod alma"+ 
                                "\n8-Dikdortgen Alaln ve Cevre Hesaplama"+ 
                                "\n0-Cikis"+ 
                                "\nSecim : ");
            secim = _sc.nextInt();
            switch(secim){
                case 1:
                    Deger();
                    System.out.println("Sonuc : "+Toplama());
                break;
                case 2:
                    Deger();
                    System.out.println("Sonuc : "+Cikarma());
                break;
                case 3:
                    Deger();
                    System.out.println("Sonuc : "+Carpma());
                break;
                case 4:
                    Deger();
                    System.out.println("Sonuc : "+Bolme());
                break;
                case 5:
                    Deger();
                    System.out.println("Sonuc : "+Us());
                break;
                case 6:
                    System.out.print("Deger giriniz : ");
                    int a = _sc.nextInt();
                    System.out.println("Sonuc : "+Faktoriyel(a));
                break;
                case 7:
                    Deger();
                    System.out.println("Sonuc : "+Mod());
                break;
                case 8:
                    Deger();
                    Dikdortgen();
                break;
                default:
                break;
            }

            System.out.println("");
        }
    }
}
