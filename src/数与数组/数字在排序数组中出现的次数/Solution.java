package 数与数组.数字在排序数组中出现的次数;

/**
 * 统计一个数字在排序数组中出现的次数。
 */

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int length = array.length;
        int first = getFirst(array, k, 0, length-1);
        int last = getLast(array, k, 0, length-1);
        if(first != -1 && last != -1){
            return last - first + 1;
        }
        return 0;
    }

    private int getFirst(int[] array, int k, int low, int high) {
        if(low>high){
            return -1;
        }
        int mid = (low+high)>>1;
        if(array[mid]>k){
            return getFirst(array, k, low, mid-1);
        }else if(array[mid]<k) {
            return getFirst(array, k, mid + 1, high);
        }else if(mid-1>=0 && array[mid-1] == k){
            return getFirst(array, k, low, mid-1);
        }else {
            return mid;
        }
    }

    private int getLast(int[] array, int k, int low, int high) {
        if(low>high){
            return -1;
        }
        int mid = (low+high)>>1;
        if(array[mid]>k){
            return getLast(array, k, low, mid-1);
        }else if(array[mid]<k){
            return getLast(array, k, mid+1, high);
        }else if(mid+1<array.length && array[mid+1] == k){
            return getLast(array, k, mid+1, high);
        }else {
            return mid;
        }
    }
}
