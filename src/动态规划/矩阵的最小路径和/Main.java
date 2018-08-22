package 动态规划.矩阵的最小路径和;

/**
 * 给定一个矩阵m，从左上角开始每次智能向右或者向下走，最后到达右下角的位置，路径上所有的数字叠加起来就是路径和，
 * 返回所有的路径中最小的路径和
 */

public class Main {
    public int getdp(int[][] m){
        int row = m.length;
        int column = m[0].length;
        int[][] dp = new int[row][column];
        dp[0][0] = m[0][0];
        for(int i = 1;i<row;i++){
            dp[i][0] = m[i][0]+dp[i-1][0];
        }
        for(int j = 1;j<column;j++){
            dp[0][j] = m[0][j]+dp[0][j-1];
        }
        for(int i = 1;i<row;i++){
            for(int j = 1;j<column;j++){
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+m[i][j];
            }
        }
        return dp[row-1][column-1];
    }
}
