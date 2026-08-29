class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<digits.length;j++){
                if(i==j) continue;
                for(int k=0;k<digits.length;k++){
                    if(i!=k && j!=k){
                    if(digits[k]%2==0){
                        int n = (digits[i]*100 + digits[j]*10 +digits[k]);
                        hash.add(n);
                    }
                    }
                }
            }
        }
        return hash.size();
    }
}