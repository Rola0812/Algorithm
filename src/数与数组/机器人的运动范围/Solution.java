package 数与数组.机器人的运动范围;

/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
 * 每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class Solution {
    public int movingCount(int threshold, int rows, int cols) {
        int[][] flag = new int[rows][cols];
        int counts = 0;
        return help(flag, threshold, 0, 0, rows, cols, counts);
    }

    private int help(int[][] flag, int threshold, int i, int j, int rows, int cols, int counts) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || getNums(i) + getNums(j) > threshold || flag[i][j] == 1) {
            return 0;
        } else {
            flag[i][j] = 1;
            return help(flag, threshold, i + 1, j, rows, cols, counts) +
                    help(flag, threshold, i - 1, j, rows, cols, counts) +
                    help(flag, threshold, i, j + 1, rows, cols, counts) +
                    help(flag, threshold, i, j - 1, rows, cols, counts) + 1;
        }
    }

    private int getNums(int i) {
        int ans = 0;
        while (i > 0) {
            ans += i % 10;
            i = i / 10;
        }
        return ans;
    }
}