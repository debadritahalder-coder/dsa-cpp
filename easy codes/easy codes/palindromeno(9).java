class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                c = 1;
                break;
            }
        }
        if (c == 1)
            return false;
        else
            return true;
    }
}
