package Recursion;

public class decimalBinary {
    static String res ="";
    static void decbin(int n){
        if(n==0){
            return;
        }
        res = res+n%2;
        decbin(n/2);
    }
    public static void main(String[] args) {
        int n=45;
        decbin(n);
        System.out.println(res);
    }
}
