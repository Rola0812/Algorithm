package 栈与队列.包含min函数的栈;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Solution {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    public void push(int node) {
        if(stack.empty()){
            minStack.push(node);
        }else if(node < min()){
            minStack.push(node);
        }
        stack.push(node);
    }

    public void pop() {
        int value = stack.pop();
        if (value==min()){
            minStack.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
