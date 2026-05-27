class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i, j;
        String s = "";

        if (strs.length == 0) {
            return "";
        }

        int l = strs[0].length();

        for (i = 1; i < strs.length; i++) {
            if (strs[i].length() < l) {
                l = strs[i].length();
            }
        }

        for (j = 0; j < l; j++) {
            char ch = strs[0].charAt(j);

            for (i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) != ch) {
                    return s;
                }
            }

            s = s + ch;
        }

        return s;
    }
}