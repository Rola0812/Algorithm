package 动态规划.换钱的最少货币数;

public class Main {
    public int dp(int[] arr, int aim){
        if(arr == null || arr.length == 0 || aim < 0){
            return -1;
        }
        int n = arr.length;
        int max = Integer.MAX_VALUE;
        int[][] dp = new int[n][aim+1];
        for(int j = 1;j<=aim;j++){
            dp[0][j] = Integer.MAX_VALUE;
            if(j - arr[0]>= 0 && dp[0][j-arr[0]] != max){
                dp[0][j] = dp[0][j-arr[0]]+1;
            }
        }
        int left = 0;
        for(int i =1; i<n;i++){
            for(int j = 1;j<=aim;j++){
                left = max;
                if(j - arr[i]>=0 && dp[i][j-arr[i]] != max){
                    left = dp[i][j-arr[i]] + 1;
                }
                dp[i][j] = Math.min(left, dp[i-1][j]);
            }
        }
        return dp[n-1][aim] != max ? dp[n-1][aim] : -1;
    }
}
