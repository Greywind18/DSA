class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length(), m = word2.length();
        int i=0,j=0;
        boolean flag = false;
        while(i<n && j<m){
            if(i<n && flag==false){
                sb.append(word1.charAt(i));
                i++;
                flag = true;
            }else if(j<m && flag==true){
                sb.append(word2.charAt(j));
                j++;
                flag = false;
            }
        }
        while(i<n){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<m){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}