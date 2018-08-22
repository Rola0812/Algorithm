package 字符串.字符串的排列;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<String>();
        if(str != null && str.length() != 0){
            PermutationHelper(str.toCharArray(), 0, list);
            Collections.sort(list);
        }
        System.out.println(list);
        return list;
    }

    private static void PermutationHelper(char[] cs, int i, ArrayList<String> list) {
        if(i == cs.length-1){
            for(int k = 0;k<list.size();k++){
                if(list.get(k).equals(String.valueOf(cs))){
                    return;
                }
            }
            list.add(String.valueOf(cs));
        }else {
            for(int j = i;j<cs.length;j++){
                if(j == i || cs[j] != cs[i]){
                    swap(cs,i,j);
                    PermutationHelper(cs,i+1, list);
                    swap(cs,i,j);
                }
            }
        }
    }

    private static void swap(char[] cs,int i,int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.Permutation("aazz");
    }
}
