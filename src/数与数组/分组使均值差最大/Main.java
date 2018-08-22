package 数与数组.分组使均值差最大;
/**
 * 0-100的N个数(数的值范围为0~100 1 < N <= 1000),分成两组A、B:怎样分|meanA-meanB|最大?
 */

import java.util.Arrays;

public class Main {
    public double getMinValue(int[] a) {
        int n = a.length;
        int sum = Arrays.stream(a).sum();
        int[] f = new int[101];
        for(int i = 0;i<=100;i++){
            f[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            f[a[i]]++;
        }
        int[] sortedArray = new int[n];
        int index = 0;
        for(int i = 0; i<= 100;i++){
            while (f[i] > 0){
                f[i]--;
                sortedArray[index++] = i;
            }
        }
        int minSum = 0;
        double maxValue = Double.MIN_VALUE;

        for(int i = 0;i<n;i++){
            minSum += sortedArray[i];
            double minMean = (double)minSum/(i+1);
            double maxMean = (double)(sum - minSum) / (n-i-1);
            maxValue = Math.max(maxValue, Math.abs(minMean-maxMean));
        }
        return maxValue;
    }
}

