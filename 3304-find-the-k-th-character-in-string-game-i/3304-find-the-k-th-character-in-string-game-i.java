class Solution {
    public char kthCharacter(int k) {
        return solve(k, "a");
    }

    static char solve(int k, String s) {
        if (s.length() >= k) {
            return s.charAt(k - 1);
        }

        String build = "";

        for (int i = 0; i < s.length(); i++) {
            build += (char)(s.charAt(i) + 1);
        }

        return solve(k, s + build);
    }
}