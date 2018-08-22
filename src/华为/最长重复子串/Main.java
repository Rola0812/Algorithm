package 华为.最长重复子串;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            char[] chs = s.toCharArray();
            int length = chs.length;
            if(length>100){
                return;
            }
            int max = 0;
            int index = 0;
            int temp = 0;
            int j = 0;
            for(int gap = 1; gap < length;gap++){
                for(j = 0; j< length-gap;j++){
                    if(chs[j] == chs[j+gap]){
                        temp++;
                    }else {
                        temp = 0;
                    }
                    if (temp > max) {
                        max = temp;
                        index = j - temp + 1;
                        System.out.println(max);
                        System.out.println(temp);
                        System.out.println(j);
                        System.out.println(index);
                        System.out.println(gap);
                        System.out.println("--------------------");
                    }
                }
            }
            if(max > 0 && index>0) {
                System.out.println(s.substring(index, index+max) + " " + max);
            }else {
                System.out.println(" "+0);
            }
        }

    }

    public static String maxRepat(String input) {
        // 参数检查
        if (input == null || input.length() == 0) {
            return null;
        }
        // 重复子串的最长长度
        int max = 0;
        // 最长重复子串的起始位置
        int first = 0;
        int k = 0;
        for (int i = 1; i < input.length(); i++) {
            for (int j = 0; j < input.length() - i; j++) {
                if (input.charAt(j) == input.charAt(i + j)) {
                    k++;
                } else {
                    k = 0;
                }
                if (k > max) {
                    max = k;
                    first = j - k + 1;
                }
            }
        }
        if (max > 0) {
            return input.substring(first, first + max);
        }
        return null;
    }

//    public static void main(String[] args) {
//        String str1 = "abcdeabeeecde";
//        String str2 = "helloawdhello";
//        int result = Main.lengthOfLongestSubstring(str1);
//        System.out.println(result);
//    }

    public static String find(String str) {

        //最长的重复字串，极端情况就比如abcabc，最长重复字串就是abc

        //即为字符串长度的一半，当然这是极端情况，通常都是小于串长一半的
        String left = "";
        String reg = "";

        for (int len = str.length() / 2; len > 0; len--) {

            //将字符串分隔为若干“最长字串”

            for (int i = 0; i < str.length() / len; i++) {

                //获取“最长字串”

                reg = str.substring(0, len + 1);

                //刨去“最长字串”剩下的串

                left = str.substring(len + 1);

                //如果剩下的串里面包含“最长字串”

                if (left.indexOf(reg) != -1)

                    //bingo!

                    return reg;

            }

        }

        //啥也找不到就返回空吧

        return null;

    }
    public static int lengthOfLongestSubstring(String s) {
        // write your code here
        if(s.length()==0){
            return 0;
        }
        int maxLength=1;
        List<Character> list=new ArrayList<Character>();
        list.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(list.contains(s.charAt(i))){
                int index=list.indexOf(s.charAt(i));
                list=list.subList(index+1, list.size());
                list.add(s.charAt(i));
//				System.out.println(list);
                maxLength=Math.max(maxLength, list.size());
            }else{
                list.add(s.charAt(i));
                maxLength=Math.max(maxLength, list.size());
            }
        }
        return maxLength;
    }

}

