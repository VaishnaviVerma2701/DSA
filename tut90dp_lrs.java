import java.io.*;
import java.util.*;
 
class longestrepetingsubsequence {
    public static int longestrepetingSubseq(String S)
    {
 
        // dp[i][j] will store the length of the longest
        // palindromic subsequence for the substring
        // starting at index i and ending at index j
        int dp[][]
            = new int[S.length() + 1][S.length() + 1];
 
        // Filling up DP table based on conditions discussed
        // in above approach
        for (int i = 1; i <= S.length(); i++) {
            for(int j=1;j<=S.length();j++){
                if (S.charAt(i - 1) == S.charAt(j - 1)&&i!=j)
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i][j - 1],
                                        dp[i - 1][j]);
            
        }
    }
        // At the end DP table will contain the LPS
        // So just return the length of LPS
        return dp[S.length()][S.length()];
    }
   
    // Driver code
    public static void main(String[] args)
    {
        String s = "GEEKSFORGEEKS";
        System.out.println("The length of the LPS is "
                           + longestrepetingSubseq(s));
                          
}
}
// ans = GEEKS

