class Solution {
    public int minOperations(String s) {
        int cnt_x = 0, cnt_y = 0;
        char p = '0', q = '1';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == p) {
            } else {
                cnt_x++;
            }
            p = p == '0' ? '1' : '0';
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == q) {
            } else {
                cnt_y++;
            }
            q = q == '0' ? '1' : '0';
        }
        return Math.min(cnt_x, cnt_y);

    }
}