package 动态规划.换钱的方法数;

public class Main {

    public int coins(int[] arr, int aim){
        if(arr == null || arr.length == 0 || aim<0){
            return 0;
        }
        int[][] dp = new int[arr.length][aim+1];
        for(int i = 0;i<arr.length;i++){
            dp[i][0] = 1;
        }
        for(int j = 1;arr[0] * j <=aim;j++){
            dp[0][arr[0]*j] = 1;
        }
        int num = 0;
        for(int i = 1;i<arr.length;i++){
            for(int j = 1;j<=aim;j++){
                num = 0;
                for(int k = 0;j-arr[i]*k>=0;k++){
                    num += dp[i -1][j-arr[i]*k];
                }
                dp[i][j] = num;
            }
        }
        return dp[arr.length - 1][aim];
    }

}
