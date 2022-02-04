package ATM;
import java.util.Scanner;
public class KodluyoruzAtm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, password;
        double balance = 1500.0;
        int right =3;
        while(right>0){
            System.out.print("Kullanici adi giriniz : ");
            userName = sc.next();
            System.out.print("Sifre giriniz : ");
            password = sc.next();

            if(userName.equals("PatikaDev") && password.equals("java101")){
                System.out.println("Girisiniz basarili.");
                byte secim = 0;
                while(secim !=4){

                    System.out.println("Yapicaginiz islemi seciniz ;\n1-Bakiye Sorgulama\n2-Para Cekme\n3-Para Yatirma\n4-Cikis Yap");

                    secim = sc.nextByte();
                    
                    switch(secim){
                        case 1:
                            System.out.println("Bakiyeniz : "+balance);
                        break;

                        case 2:
                            System.out.println("Çekmek istediginiz miktari giriniz : ");
                            int miktar = sc.nextInt();
                            if(miktar>balance){
                                System.out.println("Bakiye yetersiz.");
                            }
                            else balance=balance-miktar;
                            
                        break;

                        case 3:
                            System.out.println("Miktar giriniz : ");
                            int miktar2 = sc.nextInt();
                            balance = balance+miktar2;
                        break;
                    }
                    
                }
                
                if(secim==4) System.out.println("Gorusmek uzere."); break;
            }
            else{ 
                right--; 
                
                if(right == 0){
                    System.out.println("Hesabiniz bloke olmuştur.");
                }
                else System.out.println("Hatali giris, kalan hakkiniz: "+right);
            }
        }
        sc.close();
    }
}
