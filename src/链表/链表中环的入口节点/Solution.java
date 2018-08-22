package 链表.链表中环的入口节点;

import java.util.HashSet;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
//可以用hashset做
public class Solution {
    public ListNode EntryNodeOfLoop2(ListNode pHead)
    {
        HashSet<ListNode> set = new HashSet<ListNode>();
        while (pHead != null) {
            if (!set.add(pHead)) {
                return pHead;
            }
            pHead = pHead.next;
        }
        return null;
    }

    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null || pHead.next == null || pHead.next.next == null){
            return null;
        }
        ListNode cur1 = pHead.next;
        ListNode cur2 = pHead.next.next;

        while (cur1 != cur2){
            if(cur1 != null && cur1.next != null) {
                cur1 = cur1.next;
                cur2 = cur2.next.next;
            }else {
                return null;
            }
        }
        cur1 = pHead;
        while (cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}
