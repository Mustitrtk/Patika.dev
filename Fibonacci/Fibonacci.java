package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n=0,n2=1,temp;
        for(int i =0;i<8;i++){
            temp = n+n2;
            System.out.print(temp+" ");
            n=n2;
            n2=temp;
        }
    }
}
