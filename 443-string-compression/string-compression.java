class Solution {
    public int compress(char[] chars) {
        StringBuilder ans = new StringBuilder();
        char curr_c = chars[0];
        int cnt = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == curr_c) {
                cnt++;
            } else {
                ans.append(curr_c);
                if (cnt > 1) {
                    ans.append(cnt);
                }
                curr_c = chars[i];
                cnt = 1;
            }
        }
       
        ans.append(curr_c);
        if (cnt > 1) {
            ans.append(cnt);
        }
        String tempAns = ans.toString();
        System.out.println(tempAns);
        for (int i = 0; i < tempAns.length(); i++) {
        chars[i] = ans.charAt(i);
    }
        return tempAns.length();
    }
}