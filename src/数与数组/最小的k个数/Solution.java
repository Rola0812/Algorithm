package 数与数组.最小的k个数;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(input.length==0 || k>input.length || k ==0 ){
            return result;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //从大到小，大顶堆
                return o2.compareTo(o1);
            }
        });
        for(int i = 0;i<input.length;i++){
            if(queue.size()<k){
                queue.offer(input[i]);
            }else if(input[i]<queue.peek()){
                Integer temp = queue.poll();
                temp = null;
                queue.offer(input[i]);
            }
        }
        for(Integer i:queue){
            result.add(i);
        }
        return result;
    }
}
