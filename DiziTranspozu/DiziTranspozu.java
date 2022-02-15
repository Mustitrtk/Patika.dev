package DiziTranspozu;
public class DiziTranspozu{

    static void print(int[][] arr){
        for(int i =0;i<2;i++){
            for(int j =0;j<3;j++ ){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }

    static void transpoze(int[][] arr){
        int[][] arrT = new int[3][2];

        for(int i =0; i<2;i++){
            for(int j =0; j<3;j++){
                arrT[j][i]=arr[i][j];
            }
        }

        for(int a =0;a<3;a++){
            for(int b =0;b<2;b++ ){
                System.out.print(arrT[a][b]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int[][] dizi = new int[][]{{1,2,3},{4,5,6}};
        print(dizi);
        System.out.println("");
        transpoze(dizi);
    }
}