package 数与数组.和为S的连续正整数序列;

import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 */

/**
 * //根据数学公式计算:(a1+an)*n/2=s  n=an-a1+1
 *  
 *       //(an+a1)*(an-a1+1)=2*s=k*l(k>l)
 *  
 *       //an=(k+l-1)/2  a1=(k-l+1)/2
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(sum<3){
            return list;
        }
        int s=(int) Math.sqrt(2*sum);
        for(int i = s;i>=2;i--){
            if(2*sum%i == 0){
                int l = 2*sum / i;
                //k和l必须一个为偶数，一个为奇数
                if(i%2 == 0 && l%2 != 0 || i%2 != 0 && l%2 == 0){
                    int a = (l-i+1)/2;
                    int b = (l+i-1)/2;
                    ArrayList<Integer> arrayList = new ArrayList<Integer>();
                    for(int j=a;j<=b;j++){
                        arrayList.add(j);
                    }
                    list.add(arrayList);
                }
            }
        }
        return list;
    }
}
