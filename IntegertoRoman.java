import java.util.*;

public class IntegertoRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         int[] val = {
            1,4,5,9,10,40,50,90,100,400,500,900,1000
        };
        String[] str = {
            "I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"
        };
        StringBuilder sb = new StringBuilder();
        for(int i=val.length-1;i>=0;i--){
            while(num>=val[i]){
                sb.append(str[i]);
                num -= val[i];
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
