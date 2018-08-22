package 字符串.匹配括号;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<String> list = new ArrayList();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = n, r = n;
        helper(l, r, new StringBuilder());
        StringBuilder res = new StringBuilder();
        for(String s: list) {
            res.append(s).append(',');
        }
        res.deleteCharAt(res.length()-1);
        System.out.println(res.toString());
    }

    public static void helper(int l, int r, StringBuilder sb){
        if(r<l) return;
        if(l==0 && r==0) list.add(sb.toString());
        if(l>0){
            helper(l-1, r, sb.append('('));
            sb.deleteCharAt(sb.length()-1);
        }
        if(r>0){
            helper(l, r-1, sb.append(')'));
            sb.deleteCharAt(sb.length()-1);
        }
    }
}



