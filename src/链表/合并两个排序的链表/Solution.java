package 链表.合并两个排序的链表;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode cur1 = list1;
        ListNode cur2 = list2;

        ListNode cur = new ListNode(-1);
        ListNode head = cur;

        while (cur1 != null && cur2 != null ){
            if(cur1.val <= cur2.val){
                cur.next = cur1;
                cur1 = cur1.next;
            }else {
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        if(cur1 != null){
            cur.next = cur1;
        }
        if(cur2 != null){
            cur.next = cur2;
        }
        return head.next;
    }
}
