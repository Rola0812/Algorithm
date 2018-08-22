package 数与数组.丑数;

import java.util.ArrayList;

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index<7){
            return index;
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        for(int i = 1;i<index;++i){
            int num = Math.min(list.get(t2)*2, Math.min(list.get(t3)*3, list.get(t5)*5));
            list.add(num);
            if(num == list.get(t2)*2) t2++;
            if(num == list.get(t3)*3) t3++;
            if(num == list.get(t5)*5) t5++;
        }
        return list.get(list.size()-1);
    }
}
