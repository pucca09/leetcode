package DP;

/**
 * Created by chenqingqing on 2017/3/4.
 */
public class longestPalindromeSubSeq_516 {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        for(int i = 0;i < len;i++){
            dp[i][i] = 1;
        }
        //for each interval length
        for(int l = 2;l <= len;l++){
            //for each interval with the same length
            for(int st = 0;st <= len-l;st++){
                int ed = st+l-1;
                //if left end equals to right end or not
                dp[st][ed] = s.charAt(st)==s.charAt(ed)? dp[st+1][ed-1]+2 : Math.max(dp[st+1][ed], dp[st][ed-1]);
            }
        }
        return dp[0][len-1];
    }
}
