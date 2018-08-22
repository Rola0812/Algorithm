package 链表.两个链表的第一个公共节点;

import java.util.HashMap;
import java.util.List;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        ListNode current1 = pHead1;
        ListNode current2 = pHead2;
        HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();

        while (current1 != null){
            map.put(current1,1);
            current1 = current1.next;
        }
        while (current2 != null){
            if(map.containsKey(current2)){
                return current2;
            }
            current2 = current2.next;
        }
        return null;
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode current1 = pHead1;
        ListNode current2 = pHead2;
        int length1 = 0;
        int length2 = 0;

        while (current1 != null){
            current1 = current1.next;
            length1++;
        }

        while (current2 != null){
            current2 = current2.next;
            length2++;
        }

        current1 = pHead1;
        current2 = pHead2;

        int gap = length2>length1?length2-length1:length1-length2;

        if(length2>length1){
            while (gap>0){
                current2 = current2.next;
                gap--;
            }
        }

        if(length1>length2){
            while (gap>0){
                current1 = current1.next;
                gap--;
            }
        }

        while (current1 != current2){
            current1 = current1.next;
            current2 = current2.next;
        }
        return current1;
    }
}
