package DP;

/**
 * Created by chenqingqing on 2017/3/4.
 */
public class LongestPalindromicSubstring_5 {
    public String longestPalindrome(String s) {
        char[] str = s.toCharArray();
        int n = s.length();
        int longestBegin = 0;
        int maxLen = 1;
        boolean table[][] = new boolean[s.length()][s.length()];
        for (int i = 0; i < n; i++) {
            table[i][i] = true;
        }
        for (int i = 0; i < n-1; i++) {
            if (str[i] == str[i+1]) {
                table[i][i+1] = true;
                longestBegin = i;
                maxLen = 2;
            }
        }
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n-len+1; i++) {
                int j = i+len-1;
                if (str[i] == str[j] && table[i+1][j-1]) {
                    table[i][j] = true;
                    longestBegin = i;
                    maxLen = len;
                }
            }
        }
        return s.substring(longestBegin, longestBegin+maxLen);
    }
}
