package 数与数组.构建乘积数组;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class Solution {
    public int[] multiply(int[] A) {
        int length = A.length;
        int[] forward = new int[length];
        int[] backword = new int[length];
        int[] B = new int[length];

        forward[0] = 1;
        backword[0] = 1;
        for(int i = 1;i<length;i++){
            forward[i] = forward[i-1]*A[i-1];
            backword[i] = backword[i-1]*A[length-i];
        }
        for(int i = 0;i<length;i++){
            B[i]=forward[i]*backword[length-i-1];
        }
        return B;
    }
}
