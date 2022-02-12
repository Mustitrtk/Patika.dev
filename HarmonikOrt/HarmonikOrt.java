package HarmonikOrt;
public class HarmonikOrt{
    public static void main(String[] args) {
        int[] dizi = {1,2,3,4,5};
        double sum =0.0;

        for(int i =0;i<dizi.length;i++){
            sum += 1.0/dizi[i];
        }

        System.out.println("Dizinin harmonik ortalaması : "+sum);
    }
}