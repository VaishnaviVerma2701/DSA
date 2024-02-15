import java.util.*;
class lcs{
   static int lcs(int m,int n,String a,String b){
    int dp[][]=new int[m+1][n+1];
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            dp[i][j]=-1;
        }
    }
    return lcsUtil(m,n,a,b,dp);
   } 
   static int lcsUtil(int m,int n,String a,String b,int dp[][]){
if(m==0||n==0){
    return 0;
}

if(dp[m][n]!=-1){
    return dp[m][n];
}
if(a.charAt(m-1)==b.charAt(n-1)){
    dp[m][n]=1+lcsUtil(m-1,n-1,a,b,dp);
    return dp[m][n];
}
else
return dp[m][n]=  Math.max(lcsUtil(m,n-1,a,b,dp),lcsUtil(m-1,n,a,b,dp));
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   // String a=sc.nextLine();
    //String b=sc.nextLine();
    String a="aggtab";    
    String b="gxtxayb";
    int m=a.length();
    int n=b.length();
     System.out.println(lcs(m,n,a,b));
}
}


 
class lcs1 {
 
    // A Top-Down DP implementation of LCS problem
 
    // Returns length of LCS for X[0..m-1], Y[0..n-1]
    static int lcs(String X, String Y, int m, int n,
                   int[][] dp)
    {
 
        if (m == 0 || n == 0)
            return 0;
 
        if (dp[m][n] != -1)
            return dp[m][n];
 
        if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            dp[m][n] = 1 + lcs(X, Y, m - 1, n - 1, dp);
            return dp[m][n];
        }
 
        dp[m][n] = Math.max(lcs(X, Y, m, n - 1, dp),
                            lcs(X, Y, m - 1, n, dp));
        return dp[m][n];
    }
 
    // Drivers code
    public static void main(String args[])
    {
 
        String X = "AGGTAB";
        String Y = "GXTXAYB";
 
        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                dp[i][j] = -1;
            }
        }
 
        System.out.println("Length of LCS is "
                           + lcs(X, Y, m, n,dp));
}
}