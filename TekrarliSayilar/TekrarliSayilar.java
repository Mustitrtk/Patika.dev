package TekrarliSayilar;

public class TekrarliSayilar {

    static boolean isFind(int[]arr,int value){
        for(int i :arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] dizi = {5,6,2,2,8,5,7,12,11,7,21,6,16,11};
        int[] duplicate = new int[dizi.length];
        int index =0;
        for(int i = 0;i<dizi.length;i++){
            for(int j =0;j<dizi.length;j++){
                if(i!=j && dizi[i]==dizi[j] && dizi[i]%2==0){
                    if(!isFind(duplicate,dizi[i])){
                        duplicate[index] = dizi[i];
                        index++;
                    }
                    
                }
            }
        }

        for(int item:duplicate){
            if(item !=0){
                System.out.print(item+" ");
            }
        }
    }
}
