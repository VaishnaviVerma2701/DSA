import java.util.*;
class lsc2 {
 
    // A Top-Down DP implementation of LCS problem
 
    // Returns length of LCS for X[0..m-1], Y[0..n-1]
    static int lcs(int m,int n,String a,String b){
    int dp[][]=new int[m+1][n+1];
    // for(int i=1;i<=m;i++){
    //     for(int j=1;j<=n;j++){
    //         dp[i][j]=-1;
    //     }
    // }
    return lcsUtil(a,b,m,n,dp);
   } 
    static int lcsUtil(String a, String b, int m, int n,
                   int[][] dp)
    {
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[m][n];
    }
     public static void main(String args[])
    {
 
        String a = "AGGTAB";
        String b = "GXTXAYB";
 
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];
     
        
 
        System.out.println("Length of LCS is "
                           + lcs(m,n,a,b));
                           
}}

