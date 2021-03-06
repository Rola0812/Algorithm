package 位运算.二进制中1的个数;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */

public class Solution {
    public int NumberOf1(int n) {
        int i=0;
        while (n!=0){
            n=n&n-1;
            i++;
        }
        return i;
    }

    public int NunberOf1_2(int n){
        int count = 0;
        while(n>0){
            if((n&1)>0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
