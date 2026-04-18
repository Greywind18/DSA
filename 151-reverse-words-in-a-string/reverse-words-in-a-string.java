class Solution {
    public String reverseWords(String s) {
        Deque<String> stack = new ArrayDeque<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (temp.length() > 0) {
                    stack.push(temp.toString());
                    temp = new StringBuilder();
                }
            } else {
                temp.append(s.charAt(i));
            }
        }
        if(temp.length()>0){
            stack.push(temp.toString());
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.peek());
            if(stack.size()>1){
                ans.append(' ');
            }
            stack.pop();
        }
        return ans.toString();
    }
}