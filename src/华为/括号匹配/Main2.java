package 华为.括号匹配;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        int res = 0;
        int depth = 0;
        int begin = -1;
        while(in.hasNext()){
            s = in.next();
            char[] chs = s.toCharArray();
            if(s == null || s.length() == 0){
                return;
            }
            for(int i = 0;i<chs.length;i++){
                if(chs[i] == '('){
                    depth++;
                }else if(chs[i] == ')'){
                    --depth;
                    if(depth < 0) {
                        depth = 0;
                        begin = i;
                    }else if(depth == 0){
                        res = Math.max(res, i - res);
                    }
                }
            }
            depth = 0;
            begin = chs.length;
            for (int i = begin - 1; i >= 0; --i) {
                if (chs[i] == ')') {
                    ++depth;
                } else if(chs[i] == '('){
                    --depth;
                    if (depth < 0) {
                        depth = 0;
                        begin = i;
                    } else if (depth == 0) {
                        res = Math.max(res, begin - i);
                    }
                }
            }
        }
    }


}


