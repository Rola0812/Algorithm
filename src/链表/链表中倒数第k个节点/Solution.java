package 链表.链表中倒数第k个节点;


import java.util.LinkedList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode FindKthToTail2(ListNode head,int k) {
        if(head == null){
            return null;
        }
        int step=0;
        ListNode node = head;
        while(step<k){
            if(node==null){
                return null;
            }
            node = node.next;
            step++;
        }
        while (node!= null){
            node = node.next;
            head = head.next;
        }
        return head;
    }

    public ListNode FindKthToTail3(ListNode head, int k){
        if(head == null || k == 0){
            return null;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        int count = 0;
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        ListNode node = null;
        while (count != k){
            node = stack.pop();
            count++;
        }
        return node;
    }

}
