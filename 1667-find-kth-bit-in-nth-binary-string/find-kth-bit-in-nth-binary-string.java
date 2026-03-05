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
        if(n==1) return '0';
        int len = (1<<n)-1;
        int mid = (len+1)/2;
        if(mid==k) return '1';
        if(k<mid) return findKthBit(n-1,k);
        char x = findKthBit(n-1,len-k+1);
        return x=='0' ? '1' : '0';
    }
}