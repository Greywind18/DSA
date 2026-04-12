class Solution {
    public boolean validate(String x, String str1, String str2){
        int len = x.length();
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1%len!=0 || len2%len!=0) return false;
        for(int i=0;i<str1.length();){
            String sub = str1.substring(i, i+len);
            System.out.println(sub);
            if(sub.equals(x)==false) return false;
            i+=len;
        }
        for(int i=0;i<str2.length();){
            String sub = str2.substring(i, i+len);
            if(sub.equals(x)==false) return false;
            i+=len;
        }
        return true;
    }
    public String gcdOfStrings(String str1, String str2) {
        String ans = "";
        int n = str1.length();
        int m = str2.length();
        for(int i=m-1;i>=0;i--){
            String x = str2.substring(0,i+1);
            if(validate(x,str1,str2)==true) return x;
        }
        return "";
    }
}