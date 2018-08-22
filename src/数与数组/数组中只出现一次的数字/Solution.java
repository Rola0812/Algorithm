package 数与数组.数组中只出现一次的数字;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 */
public class Solution {
    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    //两个相同数字异或=0，一个数和0异或还是它本身。
    //（1）第一次使用异或运算，得到了两个只出现一次的数相异或的结果。
    //（2）因为两个只出现一次的数肯定不同，即他们的异或结果一定不为0，一定有一个位上有1。
    // 另外一个此位上没有1，我们可以根据此位上是否有1，将整个数组重新划分成两部分，一部分此位上一定有1，
    // 另一部分此位上一定没有1，然后分别对每部分求异或，因为划分后的两部分有这样的特点：
    // 其他数都出现两次，只有一个数只出现一次。因此，我们又可以运用异或运算，分别得到两部分只出现一次的数。
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int bitresult = 0;
        for(int i = 0;i<array.length;i++){
            bitresult ^= array[i];
        }
        int index = findFirst1(bitresult);
        for(int i=0;i<array.length;i++){
            if(isBit1(array[i], index)){
                num1[0] ^= array[i];
            }else {
                num2[0] ^= array[i];
            }
        }
    }

    private boolean isBit1(int target, int index) {
        return ((target>>index) & 1) == 1;
    }

    private int findFirst1(int bitresult) {
        // index是bitresult第一个为1的位
        int index = 0;
        while(((bitresult & 1)==0) && index < 32){
            bitresult >>=1;
            index++;
        }
        return index;
    }
}
