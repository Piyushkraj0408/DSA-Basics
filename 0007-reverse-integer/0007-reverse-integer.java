class Solution {
    public int reverse(int x) {
        if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE){
            int flag = 0;
            int s = 0;
            int a;

            if(x < 0){
                x = -x;
                flag = 1;
            }

            while(x != 0){
                a = x % 10;

                // Check for overflow
                if (s > (Integer.MAX_VALUE - a) / 10) {
                    return 0;
                }

                s = s * 10 + a;
                x = x / 10;
            }

            if(flag == 1){
                return -s;
            }

            return s;
        }

        return 0;
    }
}