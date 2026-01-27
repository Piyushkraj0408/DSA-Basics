package Recursion;

public class palindrome {
    static boolean palin(String s,int i,int j){
        if(i>j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return palin(s, i+1, j-1);
    }
    public static void main(String[] args) {
        String s = "madam";
        boolean flag = palin(s,0,s.length()-1);
        if(flag){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
