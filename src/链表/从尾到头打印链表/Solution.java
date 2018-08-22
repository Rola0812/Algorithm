package 链表.从尾到头打印链表;

import java.util.ArrayList;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */


public class Solution {
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(listNode == null){
            return list;
        }
        while(listNode != null){
            list.add(0, listNode.val);
            listNode = listNode.next;
        }
        return list;
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        printListFromTailToHeadCore(listNode, list);
        return list;
    }

    public void printListFromTailToHeadCore(ListNode listNode, ArrayList<Integer> list) {
        if(listNode == null){
            return;
        }
        printListFromTailToHeadCore(listNode.next, list);
        list.add(listNode.val);
    }


}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
 }

