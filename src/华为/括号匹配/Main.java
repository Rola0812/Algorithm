package 华为.括号匹配;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        while (in.hasNext()) {
            s = in.next();
            char[] chs = s.toCharArray();
            if (chs.length == 0) {
                return;
            }
            int temp = 0;
            int max = 0;
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                if (chs[i] != '(' && chs[i] != ')') {
                    temp = 0;
                } else if (chs[i] == ')') {
                    if (stack.isEmpty()) {
                        temp = 0;
                    } else {
                        char c = stack.peek();
                        if (c == '(') {
                            stack.pop();
                            temp += 2;
                            max = Math.max(temp, max);
                        } else {
                            temp = 0;
                        }
                    }
                } else {
                    stack.push(chs[i]);
                }
            }
            System.out.println(max);
        }
    }
}

