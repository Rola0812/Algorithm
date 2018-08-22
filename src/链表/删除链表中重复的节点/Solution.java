package 链表.删除链表中重复的节点;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode deleteDuplication2(ListNode pHead)
    {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        if(pHead.val == pHead.next.val){
            ListNode node = pHead.next;
            int value = node.val;
            while (node != null && node.val == value){
                node = node.next;
            }
            return deleteDuplication2(node);
        }else {
            pHead.next = deleteDuplication2(pHead.next);
            return pHead;
        }
    }

    public ListNode deleteDuplication(ListNode pHead){
        ListNode first = new ListNode(-1);
        first.next = pHead;

        ListNode cur = pHead;
        ListNode last = pHead;

        while (cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                int value = cur.val;
                cur = cur.next.next;
                while (cur!= null && cur.val == value){
                    cur = cur.next;
                }
                last.next = cur;
            }else {
                last = cur;
                cur = cur.next;
            }
        }
        return first.next;
    }
}
