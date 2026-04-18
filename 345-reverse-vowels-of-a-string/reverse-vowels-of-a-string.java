class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder sb = new StringBuilder(s);
        while (i < j) {
            boolean isVowelx = vowels.contains(sb.charAt(i));
            boolean isVowely = vowels.contains(sb.charAt(j));

            if (isVowelx && isVowely) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            } else {
                if (!isVowelx) {
                    i++;
                }
                if (!isVowely) {
                    j--;
                }
            }
        }

        return sb.toString();
    }
}