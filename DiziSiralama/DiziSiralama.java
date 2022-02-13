package DiziSiralama;
import java.util.Scanner;
public class DiziSiralama{
    static void reverse(int[] arr){
        int temp;
        for(int i =0 ; i<arr.length;i++){
            for(int j =0; j<i;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int item : arr){
            System.out.print(item+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi uzunluğunu giriniz : ");
        int n = sc.nextInt();

        int[] dizi = new int[n];

        for(int i =0;i<n;i++){

            System.out.print("Dizinin "+(i+1)+". degeri giriniz : ");
            dizi[i]= sc.nextInt();
            
        }

        reverse(dizi);
        sc.close();
    }
}