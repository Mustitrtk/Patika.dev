package MayinTarlasi;
import java.util.Scanner;

public class Mine {

    static Scanner sc = new Scanner(System.in);
    int satir;
    int sutun;
    int mine;
    int[][] map;

    Mine(int satir, int sutun){
        this.satir=satir;
        this.sutun=sutun;
        this.mine=(int)(satir*sutun)/4;
        this.map=new int[satir][sutun];
    }

    void run(){

        //set mine
        int sayac=0;
        for(int i=0;i<this.satir;i++){
            for(int j =0; j<this.sutun;j++){
                int random = (int)(Math.random()*2);
                if(random==0){
                    if(sayac == this.mine) this.map[i][j]=1;
                    else
                    {   
                        this.map[i][j]=-1;
                        sayac++;
                    }
                }
                else this.map[i][j]=random;
            }
        }

        //mine map
        for(int i=0;i<this.satir;i++){
            for(int j =0; j<this.sutun;j++){
                if(map[i][j]==-1){
                    System.out.print("*");
                }
                else System.out.print("-");
            }
            System.out.println("");
        }

        System.out.println("==============================");

        int can=0;
        int kullanim=0;
        while(can<this.mine){
            System.out.print("Satir giriniz : ");
            int row  = sc.nextInt();
            System.out.print("Sutun giriniz : ");
            int col = sc.nextInt();

            printMap(row, col);

            if(this.map[row][col]==-1){
                System.out.println("Mayına bastınız!!");
                can++;
            }
            else{
                System.out.println("Harika gidiyorsun!!");
            }
            if(can==this.mine){
                System.out.println("Kaybettiniz!!");
                break;
            }

            if(kullanim==(this.satir*this.sutun)-this.mine){
                System.out.println("Kazandiniz!!");
                break;
            }
            kullanim++;
        }
        
    }

    void printMap(int satir, int sutun){
        for(int i =0; i<this.satir;i++){
            for(int j = 0; j<this.sutun;j++){
                if(i==satir && j==sutun){
                    System.out.print(this.map[i][j]);
                }
                else System.out.print("-");
            }
            System.out.println("");
        }
    }
}
