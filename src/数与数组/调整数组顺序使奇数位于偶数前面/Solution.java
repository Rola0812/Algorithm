package 数与数组.调整数组顺序使奇数位于偶数前面;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution {
    //第一个思路：类似插入排序：
    public void reOrderArray(int [] array) {
        if(array == null || array.length != 0){
            return;
        }
        for(int i = 0;i<array.length;i++){
            if(array[i]%2 == 0){
                continue;
            }else {
                int j = i;
                int temp = array[i];
                if(j == 0){
                    continue;
                }else {
                    while (j>0){
                        if(array[j-1]%2 == 0){
                            array[j] = array[j-1];
                            j--;
                        }else {
                            break;
                        }
                    }
                    array[j] = temp;
                }
            }
        }
    }

    //第二个思路，类似冒泡排序
    public void reOrderArray2(int [] array) {
        for(int i = 0;i<array.length;i++){
            for (int j=array.length-1;j>i;j--){
                if(array[j]%2 == 1 && array[j-1]%2 == 0){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

}
