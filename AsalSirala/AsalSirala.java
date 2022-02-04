package AsalSirala;

public class AsalSirala {
    public static void main(String[] args) {
        boolean f = false;
        for(int i =2;i<=100;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    f = true;
                }
            }
            if(f==false) System.out.print(i+" ");
            else f=false;
        }
    }
}
