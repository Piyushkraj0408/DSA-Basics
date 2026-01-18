// User function Template for Java
import java.util.Scanner;
class reverseString {
    public static void main() {
        // code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0;i<s.length()/2;i++){
            sb.setCharAt(i,s.charAt(sb.length()-i-1));
            sb.setCharAt(sb.length()-i-1,s.charAt(i));
        }
        String k = sb.toString();
        System.out.print(k);
        sc.close();
    }
}