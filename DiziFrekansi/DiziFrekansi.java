package DiziFrekansi;
import java.util.Arrays;
public class DiziFrekansi {
    static void Frekans(int[] arr){
        Arrays.sort(arr);
        int sayac=0;
        for(int i = 0;i<arr.length;i++){
            for(int j= 0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    sayac++;
                }
            }
            
            if(i==0 && arr[i+1]==arr[i]) {
                System.out.println(arr[i] + " sayısı " + sayac + " kez tekrar edildi. ");
            }
            if(i==0 && arr[i+1]!=arr[i]) {
                System.out.println(arr[i] + " sayısı " + sayac + " kez tekrar edildi. ");
            }
            if(i!=0 && arr[i-1]!= arr[i]){
                System.out.println(arr[i] + " sayısı " + sayac + " kez tekrar edildi. ");
            }
            sayac =0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,4,10,12,2,10,11,10,12,11};
        // 2,2,4,5,10,10,10,11,11,12,12

        Frekans(arr);
    }
}
