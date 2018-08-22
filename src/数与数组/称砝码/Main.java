package 数与数组.称砝码;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int n=cin.nextInt();//砝码种类
            int[]  weights=new int[n];
            int[]  numbers=new int[n];
            for(int i=0;i<n;i++)
                weights[i]=cin.nextInt();
            for(int i=0;i<n;i++)
                numbers[i]=cin.nextInt();
            int result=function(n,weights,numbers);
            System.out.println(result);
        }
        cin.close();
    }
    public static int function(int n,int[] weights,int[] numbers){
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<=numbers[0];i++)
            set.add(i*weights[0]);
        for(int i=1;i<n;i++){//从第二个砝码开始
            List<Integer>list =new ArrayList<Integer>(set);
            for(int j=1;j<=numbers[i];j++){//遍历砝码的个数
                for(int k=0;k<list.size();k++)
                    set.add(list.get(k)+j*weights[i]);
            }
        }
        return set.size();
    }
}
