package 数与数组.整数中1出现的次数;

/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int ones = 0;
        for(long m = 1; m<=n; m*=10) {
            long a = n/m, b = n%m;
            if(a%10 == 0){
                ones += a/10 * m;
            }
            else if(a%10 == 1){
                ones += a/10*m +(b+1);
            }
            else
                ones += (a/10+1)*m;
        }
        return ones;

    }
}
