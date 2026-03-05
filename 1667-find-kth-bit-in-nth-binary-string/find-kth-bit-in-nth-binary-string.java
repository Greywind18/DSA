class Solution {
    public String flipBits(String s) {
    StringBuilder sb = new StringBuilder(s);

    for (int i = 0; i < sb.length(); i++) {
        if (sb.charAt(i) == '0') {
            sb.setCharAt(i, '1');
        } else {
            sb.setCharAt(i, '0');
        }
    }

    return sb.toString();
}
    String solve(int n){
        if(n==1) return "0";
        String s = solve(n-1);
        String reversed = new StringBuilder(s).reverse().toString();
        String rightSide = flipBits(reversed);
        return s + "1" + rightSide;

    }
    public char findKthBit(int n, int k) {
        String ans = solve(n);
        int len = ans.length();
        return ans.charAt(k-1);
    }
}