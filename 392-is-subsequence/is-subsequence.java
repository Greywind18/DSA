class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        int m = s.length();
        int n = t.length();
        boolean ans = false;
        if(s.length()==0) return true;
        for(int i=0;i<n;i++){
            if(j<m && t.charAt(i)==s.charAt(j)){
                j++;
            }
        }
        if(j==s.length()) return true;
        return ans;
    }
}