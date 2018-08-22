package 数与数组.数组中的逆序对;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * 题目保证输入的数组中没有的相同的数字
 *
 * 数据范围：
 *
 * 	对于%50的数据,size<=10^4
 *
 * 	对于%75的数据,size<=10^5
 *
 * 	对于%100的数据,size<=2*10^5
 */
public class Solution {
    public int InversePairs(int [] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        int[] copy = new int[array.length];
        for(int i = 0;i<copy.length;i++){
            copy[i] = array[i];
        }
        int count = InversePairsCore(array,copy,0,array.length-1);//数值过大求余
        return count;
    }

    private int InversePairsCore(int[] array, int[] copy, int low, int high) {
        if(low == high){
            return 0;
        }
        int mid = (low+high)>>1;
        int leftcount = InversePairsCore(array, copy, low, mid)%1000000007;
        int rightcount = InversePairsCore(array, copy, mid+1, high)%1000000007;
        int count = 0;
        int i = mid;
        int j = high;
        int copyloc = high;
        while (i>=low && j>mid){
            if(array[i]>array[j]){
                count+=j-mid;
                copy[copyloc--] = array[i--];
                if(count>=1000000007){
                    count%=1000000007;
                }
            }
            else {
                copy[copyloc--] = array[j--];
            }
        }
        for(;i>=low;i--){
            copy[copyloc--] = array[i];
        }
        for(;j>mid;j--){
            copy[copyloc--] = array[j];
        }
        for(int s = low; s<=high;s++){
            array[s] = copy[s];
        }
        return (leftcount+rightcount+count)%1000000007;
    }
}
